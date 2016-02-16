package com.github.delphyne.gradle.plugins.serviceloader_manifest.extensions

import com.google.common.collect.ImmutableList

class ServiceLoaderManifestExtension {

	public final static String NAME = 'serviceLoader'

	List<String> serviceInterfaces = []

	ServiceLoaderManifestExtension serviceInterface(String... serviceInterfaces) {
		this.serviceInterfaces += ImmutableList.copyOf(serviceInterfaces)
		this
	}
}
