package com.lazan.dependency.export

abstract class MavenDependencyExportExtension {
    boolean exportSources
    boolean exportJavadoc
    boolean filterUnresolvable

    boolean getExportSources() {
        return exportSources
    }

    void setExportSources(boolean exportSources) {
        this.exportSources = exportSources
    }

    boolean getExportJavadoc() {
        return exportJavadoc
    }

    void setExportJavadoc(boolean exportJavadoc) {
        this.exportJavadoc = exportJavadoc
    }

    boolean getFilterUnresolvable() {
        return filterUnresolvable
    }

    void setFilterUnresolvable(boolean filterUnresolvable) {
        this.filterUnresolvable = filterUnresolvable
    }
}
