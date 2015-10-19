include linux-xlnx.inc

SRC_URI = " \
        git://github.com/torvalds/linux.git;protocol=https;branch=master \
        file://xilinx-base;type=kmeta;destsuffix=xilinx-base \
        "
SRCREV = "bfa76d49576599a4b9f9b7a71f23d73d6dcff735"

LINUX_VERSION = "3.19"
PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"
