# Branch Plugin for SonarQube Community Edition
[![Build Status](https://travis-ci.org/uknickwilliams/sonar-branch-community.svg?branch=master)](https://travis-ci.org/uknickwilliams/sonar-branch-community)

## Description / Features

This plugin is an open source alternative to the [Branch Plugin](https://docs.sonarqube.org/display/PLUG/Branch+Plugin) for SonarQube Community Edition.

## Usage

Project must exists before scanning branches other than `master`.
There are currently no usage differences to [Branch Plugin](https://docs.sonarqube.org/display/PLUG/Branch+Plugin).

### Installation
Drop plugin jar file in SonarQube `/extensions/plugins` directory and restart the SonarQube.

## Compatibility 

| Plugin Version | Compatible SonarQube |
| -------------  | -------------------- |
| 1.x.x          | 6.7+, 7.0            |
| 2.0.0          | 7.1                  |
| 2.0.1          | 7.2.1 (not working)  |

## Work In Progress
The plugin compile but it's not working. I have a classpath problem when I install the plugin
