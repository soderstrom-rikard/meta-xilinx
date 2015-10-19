include u-boot-xlnx.inc

LIC_FILES_CHKSUM = "file://README;beginline=1;endline=6;md5=157ab8408beab40cd8ce1dc69f702a6c"

# u-boot-v2015.01 release
SRC_URI = "git://git.denx.de/u-boot.git;branch=master"
SRCREV = "92fa7f53f1f3f03296f8ffb14bdf1baefab83368"
PV = "v2015.01${XILINX_EXTENSION}+git${SRCPV}"

UBOOT_ENV_zc702-zynq7 = "uEnv"
UBOOT_ENV_zedboard-zynq7 = "uEnv"
UBOOT_ENV_zybo-zynq7 = "uEnv"

SRC_URI_append_zc702-zynq7 = " file://ps7_init.h file://ps7_init.c file://uEnv.txt"
SRC_URI_append_zedboard-zynq7 = " file://ps7_init.h file://ps7_init.c file://uEnv.txt"
SRC_URI_append_zybo-zynq7 = " file://ps7_init.h file://ps7_init.c file://uEnv.txt"

do_install_prepend() {
    cp ${S}/spl/u-boot-spl.bin ${S}/${SPL_BINARY}
}

