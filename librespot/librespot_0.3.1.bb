# Auto-Generated by cargo-bitbake 0.3.14
#
inherit cargo pkgconfig module-base

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get librespot could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/librespot/0.3.1"
SRC_URI:append = "git://github.com/librespot-org/librespot.git;protocol=https;nobranch=1 \
                  file://0001-explicitly-enable-std-for-priority-queue.patch"
SRCREV = "c1ac4cbb3ad3bbdaeb6f8582186442c69cdae744"

S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""

#DEPENDS += "alsa-lib pulseaudio-dev"
DEPENDS += " alsa-lib avahi"
RDEPENDS:${PN} = " libavahi-compat-libdnssd-dev"
CARGO_BUILD_FLAGS += '--features "alsa-backend" --features "with-dns-sd"'

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aes-ctr/0.6.0 \
    crate://crates.io/aes-soft/0.6.4 \
    crate://crates.io/aes/0.6.0 \
    crate://crates.io/aesni/0.10.0 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/alsa-sys/0.3.1 \
    crate://crates.io/alsa/0.5.0 \
    crate://crates.io/anyhow/1.0.43 \
    crate://crates.io/async-trait/0.1.51 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bindgen/0.56.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/bumpalo/3.7.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.0.1 \
    crate://crates.io/cc/1.0.69 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cexpr/0.4.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/cipher/0.2.5 \
    crate://crates.io/clang-sys/1.2.0 \
    crate://crates.io/colored/1.9.3 \
    crate://crates.io/combine/4.6.0 \
    crate://crates.io/core-foundation-sys/0.8.2 \
    crate://crates.io/coreaudio-rs/0.10.0 \
    crate://crates.io/coreaudio-sys/0.2.8 \
    crate://crates.io/cpal/0.13.4 \
    crate://crates.io/cpufeatures/0.1.5 \
    crate://crates.io/crypto-mac/0.11.1 \
    crate://crates.io/ctr/0.6.0 \
    crate://crates.io/darling/0.10.2 \
    crate://crates.io/darling_core/0.10.2 \
    crate://crates.io/darling_macro/0.10.2 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dns-sd/0.1.3 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/env_logger/0.8.4 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.0.1 \
    crate://crates.io/futures-channel/0.3.16 \
    crate://crates.io/futures-core/0.3.16 \
    crate://crates.io/futures-executor/0.3.16 \
    crate://crates.io/futures-io/0.3.16 \
    crate://crates.io/futures-macro/0.3.16 \
    crate://crates.io/futures-sink/0.3.16 \
    crate://crates.io/futures-task/0.3.16 \
    crate://crates.io/futures-util/0.3.16 \
    crate://crates.io/futures/0.3.16 \
    crate://crates.io/generic-array/0.14.4 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.2.3 \
    crate://crates.io/glib-macros/0.10.1 \
    crate://crates.io/glib-sys/0.10.1 \
    crate://crates.io/glib/0.10.3 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/gobject-sys/0.10.0 \
    crate://crates.io/gstreamer-app-sys/0.9.1 \
    crate://crates.io/gstreamer-app/0.16.5 \
    crate://crates.io/gstreamer-base-sys/0.9.1 \
    crate://crates.io/gstreamer-base/0.16.5 \
    crate://crates.io/gstreamer-sys/0.9.1 \
    crate://crates.io/gstreamer/0.16.7 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.4 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hmac/0.11.0 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http-body/0.4.3 \
    crate://crates.io/http/0.2.4 \
    crate://crates.io/httparse/1.5.1 \
    crate://crates.io/httpdate/1.0.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-proxy/0.9.1 \
    crate://crates.io/hyper/0.14.11 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.2.3 \
    crate://crates.io/if-addrs-sys/0.3.2 \
    crate://crates.io/if-addrs/0.6.5 \
    crate://crates.io/indexmap/1.7.0 \
    crate://crates.io/instant/0.1.10 \
    crate://crates.io/itertools/0.9.0 \
    crate://crates.io/itoa/0.4.7 \
    crate://crates.io/jack-sys/0.2.2 \
    crate://crates.io/jack/0.7.1 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni/0.19.0 \
    crate://crates.io/jobserver/0.1.24 \
    crate://crates.io/js-sys/0.3.53 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/lewton/0.10.2 \
    crate://crates.io/libc/0.2.99 \
    crate://crates.io/libloading/0.6.7 \
    crate://crates.io/libloading/0.7.0 \
    crate://crates.io/libm/0.2.1 \
    crate://crates.io/libmdns/0.6.1 \
    crate://crates.io/libpulse-binding/2.24.0 \
    crate://crates.io/libpulse-simple-binding/2.24.0 \
    crate://crates.io/libpulse-simple-sys/1.19.0 \
    crate://crates.io/libpulse-sys/1.19.1 \
    crate://crates.io/lock_api/0.4.4 \
    crate://crates.io/log/0.4.14 \
    crate://crates.io/mach/0.3.2 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/matches/0.1.9 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/memoffset/0.6.4 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mio/0.7.13 \
    crate://crates.io/miow/0.3.7 \
    crate://crates.io/muldiv/0.2.1 \
    crate://crates.io/multimap/0.8.3 \
    crate://crates.io/ndk-glue/0.3.0 \
    crate://crates.io/ndk-glue/0.4.0 \
    crate://crates.io/ndk-macro/0.2.0 \
    crate://crates.io/ndk-sys/0.2.1 \
    crate://crates.io/ndk/0.3.0 \
    crate://crates.io/ndk/0.4.0 \
    crate://crates.io/nix/0.20.1 \
    crate://crates.io/nom/5.1.2 \
    crate://crates.io/ntapi/0.3.6 \
    crate://crates.io/num-bigint/0.4.2 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-integer/0.1.44 \
    crate://crates.io/num-rational/0.3.2 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/num_enum/0.5.4 \
    crate://crates.io/num_enum_derive/0.5.4 \
    crate://crates.io/oboe-sys/0.4.4 \
    crate://crates.io/oboe/0.4.4 \
    crate://crates.io/ogg/0.8.0 \
    crate://crates.io/once_cell/1.8.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/parking_lot/0.11.1 \
    crate://crates.io/parking_lot_core/0.8.3 \
    crate://crates.io/paste/1.0.5 \
    crate://crates.io/pbkdf2/0.8.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pin-project-lite/0.2.7 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.19 \
    crate://crates.io/portaudio-rs/0.3.2 \
    crate://crates.io/portaudio-sys/0.1.1 \
    crate://crates.io/ppv-lite86/0.2.10 \
    crate://crates.io/pretty-hex/0.2.1 \
    crate://crates.io/priority-queue/1.1.1 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.0.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro-nested/0.1.7 \
    crate://crates.io/proc-macro2/1.0.28 \
    crate://crates.io/protobuf-codegen-pure/2.25.0 \
    crate://crates.io/protobuf-codegen/2.25.0 \
    crate://crates.io/protobuf/2.25.0 \
    crate://crates.io/quote/1.0.9 \
    crate://crates.io/rand/0.8.4 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rand_distr/0.4.2 \
    crate://crates.io/rand_hc/0.3.1 \
    crate://crates.io/redox_syscall/0.2.10 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.5.4 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rodio/0.14.0 \
    crate://crates.io/rpassword/5.0.1 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sdl2-sys/0.34.5 \
    crate://crates.io/sdl2/0.34.5 \
    crate://crates.io/semver/1.0.4 \
    crate://crates.io/serde/1.0.127 \
    crate://crates.io/serde_derive/1.0.127 \
    crate://crates.io/serde_json/1.0.66 \
    crate://crates.io/sha-1/0.9.7 \
    crate://crates.io/shannon/0.2.0 \
    crate://crates.io/shell-words/1.0.0 \
    crate://crates.io/shlex/0.1.1 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/simple_logger/1.13.0 \
    crate://crates.io/slab/0.4.4 \
    crate://crates.io/smallvec/1.6.1 \
    crate://crates.io/socket2/0.4.1 \
    crate://crates.io/stdweb/0.1.3 \
    crate://crates.io/strsim/0.9.3 \
    crate://crates.io/strum/0.18.0 \
    crate://crates.io/strum_macros/0.18.0 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.74 \
    crate://crates.io/synstructure/0.12.5 \
    crate://crates.io/system-deps/1.3.2 \
    crate://crates.io/tempfile/3.2.0 \
    crate://crates.io/termcolor/1.1.2 \
    crate://crates.io/thiserror-impl/1.0.26 \
    crate://crates.io/thiserror/1.0.26 \
    crate://crates.io/time/0.1.43 \
    crate://crates.io/tinyvec/1.3.1 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-macros/1.3.0 \
    crate://crates.io/tokio-stream/0.1.7 \
    crate://crates.io/tokio-util/0.6.7 \
    crate://crates.io/tokio/1.10.0 \
    crate://crates.io/toml/0.5.8 \
    crate://crates.io/tower-service/0.3.1 \
    crate://crates.io/tracing-core/0.1.19 \
    crate://crates.io/tracing/0.1.26 \
    crate://crates.io/try-lock/0.2.3 \
    crate://crates.io/typenum/1.13.0 \
    crate://crates.io/unicode-bidi/0.3.6 \
    crate://crates.io/unicode-normalization/0.1.19 \
    crate://crates.io/unicode-segmentation/1.8.0 \
    crate://crates.io/unicode-width/0.1.8 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/url/2.2.2 \
    crate://crates.io/uuid/0.8.2 \
    crate://crates.io/vergen/3.2.0 \
    crate://crates.io/version-compare/0.0.10 \
    crate://crates.io/version_check/0.9.3 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.76 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.76 \
    crate://crates.io/wasm-bindgen-macro/0.2.76 \
    crate://crates.io/wasm-bindgen-shared/0.2.76 \
    crate://crates.io/wasm-bindgen/0.2.76 \
    crate://crates.io/web-sys/0.3.53 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/zerocopy-derive/0.2.0 \
    crate://crates.io/zerocopy/0.3.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=98b2b0c9a6081259c441045ca68b640f \
"

SUMMARY = "An open source client library for Spotify, with support for Spotify Connect"
HOMEPAGE = "https://github.com/librespot-org/librespot"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include librespot-${PV}.inc
include librespot.inc
