require recipes-devtools/qemu/qemu.inc

DEFAULT_PREFERENCE = "-1"

LIC_FILES_CHKSUM = " \
		file://COPYING;md5=441c28d2cf86e15a37fa47e15a72fbac \
		file://COPYING.LIB;endline=24;md5=c04def7ae38850e7d3ef548588159913 \
		"

SRCREV = "cd2d5541271f1934345d8ca42f5fafff1744eee7"

PV = "2.2.0+master+zynqmp+git${SRCPV}"

SRC_URI_prepend = "git://git.qemu.org/qemu.git"
S = "${WORKDIR}/git"

# for base patches
FILESEXTRAPATHS_prepend := "${COREBASE}/meta/recipes-devtools/qemu/files:"
FILESEXTRAPATHS_prepend := "${COREBASE}/meta/recipes-devtools/qemu/qemu:"

FILESEXTRAPATHS_prepend := "${THISDIR}/qemu-zynqmp-mainline:"
SRC_URI_append += " \
		file://0001-target-arm-cpu64-Factor-out-ARM-cortex-init.patch \
		file://0002-target-arm-cpu64-Add-support-for-cortex-a53.patch \
		file://0003-arm-Introduce-Xilinx-Zynq-MPSoC.patch \
		file://0004-arm-xlnx-zynq-mp-Add-GIC.patch \
		file://0005-arm-xlnx-zynq-mp-Connect-CPU-Timers-to-GIC.patch \
		file://0006-net-cadence_gem-Clean-up-variable-names.patch \
		file://0007-net-cadence_gem-Split-state-struct-and-type-into-hea.patch \
		file://0008-arm-xilinx-zynq-mp-Add-GEM-support.patch \
		file://0009-char-cadence_uart-Clean-up-variable-names.patch \
		file://0010-char-cadence_uart-Split-state-struct-and-type-into-h.patch \
		file://0011-arm-xilinx-zynq-mp-Add-UART-support.patch \
		file://0012-arm-Add-xilinx-zynq-mp-generic-machine.patch \
		file://0013-arm-xilinx-zynq-mp-generic-Add-external-RAM.patch \
		file://0014-arm-xilinx-zynq-mp-generic-Add-bootloading.patch \
		file://0015-arm-xlnx-zynq-mp-Add-PSCI-setup.patch \
		"

