inherit adsp-sc58x-minimal

SUMMARY = "Full image for Analog Devices ADSP-SC58x boards"
LICENSE = "MIT"

MCC = " \
	libmcapi \
	sc5xx-corecontrol \
"

BLUETOOTH_AND_HEADSET = " \
	alsa-utils \
	alsa-lib \
	dbus \
	bluez5 \
	packagegroup-tools-bluetooth \
	expat \
	play \
"

IMAGE_INSTALL += " \
	${MCC} \
	${BLUETOOTH_AND_HEADSET} \
"

TODO = " \
	oprofile \
	e2fsprogs \
	mtd \
	pciutils \
	freetype \
	pound \
	version \
	v4l2_video_test \
	video_test \ 
	can-utils \
"

#BR2_TARGET_ROOTFS_JFFS2=y
#BR2_TARGET_ROOTFS_JFFS2_CUSTOM=y
#BR2_TARGET_ROOTFS_JFFS2_CUSTOM_PAGESIZE=0x100
#BR2_TARGET_ROOTFS_JFFS2_CUSTOM_EBSIZE=0x1000
#BR2_TARGET_ROOTFS_UBIFS=y


