from pathlib import Path
from milestone3 import *
import xml.etree.ElementTree as ET

pom_prefix = '{http://maven.apache.org/POM/4.0.0}'
ET.register_namespace('', 'http://maven.apache.org/POM/4.0.0')

# tree = ET.parse(ori_pom_file)
def add_clover_plugin(tree:ET.ElementTree) -> ET.ElementTree:
    root = tree.getroot()
    build = root.find(f'{pom_prefix}build')
    if build is None:
        build = ET.Element(f'{pom_prefix}build')
        root.append(build)
    plugins = build.find(f'{pom_prefix}plugins')
    if plugins is None:
        plugins = ET.Element(f'{pom_prefix}plugins')
        build.append(plugins)
    plugin = ET.Element(f'{pom_prefix}plugin')
    plugins.append(plugin)
    group_id = ET.Element(f'{pom_prefix}groupId')
    group_id.text = 'org.openclover'
    plugin.append(group_id)
    artifact_id = ET.Element(f'{pom_prefix}artifactId')
    artifact_id.text = 'clover-maven-plugin'
    plugin.append(artifact_id)
    version = ET.Element(f'{pom_prefix}version')
    version.text = '4.5.2'
    plugin.append(version)
    config = ET.Element(f'{pom_prefix}configuration')
    plugin.append(config)

    return tree

def add_evosuite_dependency(tree:ET.ElementTree) -> ET.ElementTree:
    root = tree.getroot()
    dependencies = root.find(f'{pom_prefix}dependencies')
    if dependencies is None:
        dependencies = ET.Element(f'{pom_prefix}dependencies')
        root.append(dependencies)
    dependency = ET.Element(f'{pom_prefix}dependency')
    dependencies.append(dependency)
    group_id = ET.Element(f'{pom_prefix}groupId')
    group_id.text = 'org.evosuite'
    dependency.append(group_id)
    artifact_id = ET.Element(f'{pom_prefix}artifactId')
    artifact_id.text = 'evosuite-standalone-runtime'
    dependency.append(artifact_id)
    version = ET.Element(f'{pom_prefix}version')
    version.text = '1.2.0'
    dependency.append(version)

    return tree

def add_randoop_dependency(tree:ET.ElementTree) -> ET.ElementTree:
    return tree

def update_or_add_junit_dependency(tree:ET.ElementTree) -> ET.ElementTree:
    root = tree.getroot()
    dependencies = root.find(f'{pom_prefix}dependencies')
    if dependencies is None:
        dependencies = ET.Element(f'{pom_prefix}dependencies')
        root.append(dependencies)
    junit_dependency = dependencies.find(f"{pom_prefix}dependency[{pom_prefix}artifactId='junit']")
    if junit_dependency is None:
        junit_dependency = ET.Element(f'{pom_prefix}dependency')
        dependencies.append(junit_dependency)
        group_id = ET.Element(f'{pom_prefix}groupId')
        group_id.text = 'junit'
        junit_dependency.append(group_id)
        artifact_id = ET.Element(f'{pom_prefix}artifactId')
        artifact_id.text = 'junit'
        junit_dependency.append(artifact_id)
        version = ET.Element(f'{pom_prefix}version')
        version.text = '4.12'
        junit_dependency.append(version)
    else:
        version = junit_dependency.find(f"{pom_prefix}version")
        if version is None:
            version = ET.Element(f'{pom_prefix}version')
            version.text = '4.12'
            junit_dependency.append(version)
        else:
            version.text = '4.12'

    return tree

def make_clover_pom(ori_pom_file:Path, clover_pom_file:Path) -> None:
    tree = ET.parse(ori_pom_file)
    tree = add_clover_plugin(tree)
    tree = add_evosuite_dependency(tree)
    tree = add_randoop_dependency(tree)
    tree = update_or_add_junit_dependency(tree)
    tree.write(clover_pom_file, encoding='utf-8', xml_declaration=True)

if __name__ == '__main__':
    make_clover_pom(Path('pom.xml'), Path('pom_for_clover.xml'))