require openjdk-7-release-03b147.inc

PR = "${INC_PR}.0"

ICEDTEA = "icedtea7-2.1"

SRCREV = "ae30f070f936"
PV = "03b147-2.1+2.1.1-devel+hg${SRCPV}"

ICEDTEA_URI = "hg://icedtea.classpath.org/hg/release;module=icedtea7-2.1;rev=${SRCREV}"

ICEDTEAPATCHES += "file://icedtea-zero-hotspotfix.patch;apply=no"

DISTRIBUTION_PATCHES += "patches/icedtea-zero-hotspotfix.patch"

export DISTRIBUTION_PATCHES

JDK_CHANGESET = "2d8ad70a2243"
JDK_FILE = "${JDK_CHANGESET}.tar.gz"
JDK_URI = "${ICEDTEA_HG_URL}/jdk/archive/${JDK_FILE};name=jdk;unpack=false"
SRC_URI[jdk.md5sum] = "af41ca2a658f9637fc5d496703d565db"
SRC_URI[jdk.sha256sum] = "a3f1748212086feb3351772c1bc3eb6a2918fac474a37bec219d97b668676f40"

HOTSPOT_CHANGESET = "26f5d8596931"
HOTSPOT_FILE = "${HOTSPOT_CHANGESET}.tar.gz"
HOTSPOT_URI = "${ICEDTEA_HG_URL}/hotspot/archive/${HOTSPOT_FILE};name=hotspot;unpack=false"
SRC_URI[hotspot.md5sum] = "8c5a7cd8540ee6cb1fd0a6aa39e55725"
SRC_URI[hotspot.sha256sum] = "3bf8b0a93105a0a6dbc657eaf7c95b5dd9a8dc478544e75b9e90571632f6a522"


