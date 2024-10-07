# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo pkgconfig module-base

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get librespot could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/librespot/0.5.0-dev"
SRC_URI += "git://github.com/librespot-org/librespot.git;protocol=https;nobranch=1; \
            file://0001-patch-keepalive-logic.patch \
            file://0002-update-cargo-toml.patch"
SRCREV = "2ea7436e60750d56e747abfca3893be39c0162fd"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+2ea7436e60"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.22.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aes/0.8.4 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/alsa-sys/0.3.1 \
    crate://crates.io/alsa/0.9.0 \
    crate://crates.io/anyhow/1.0.86 \
    crate://crates.io/arrayvec/0.7.4 \
    crate://crates.io/async-trait/0.1.80 \
    crate://crates.io/atomic-waker/1.1.2 \
    crate://crates.io/atomic_refcell/0.1.13 \
    crate://crates.io/autocfg/1.3.0 \
    crate://crates.io/backtrace/0.3.72 \
    crate://crates.io/base64/0.21.7 \
    crate://crates.io/base64/0.22.1 \
    crate://crates.io/base64ct/1.6.0 \
    crate://crates.io/bindgen/0.69.4 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.5.0 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/bytemuck/1.16.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.6.0 \
    crate://crates.io/cc/1.0.99 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-expr/0.15.8 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cipher/0.4.4 \
    crate://crates.io/clang-sys/1.8.1 \
    crate://crates.io/combine/4.6.7 \
    crate://crates.io/const-oid/0.9.6 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/core-foundation/0.9.4 \
    crate://crates.io/coreaudio-rs/0.11.3 \
    crate://crates.io/coreaudio-sys/0.2.15 \
    crate://crates.io/cpal/0.15.3 \
    crate://crates.io/cpufeatures/0.2.12 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/ctr/0.9.2 \
    crate://crates.io/dasp_sample/0.11.0 \
    crate://crates.io/data-encoding/2.6.0 \
    crate://crates.io/der/0.7.9 \
    crate://crates.io/deranged/0.3.11 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/displaydoc/0.2.4 \
    crate://crates.io/dns-sd/0.1.3 \
    crate://crates.io/either/1.12.0 \
    crate://crates.io/encoding_rs/0.8.34 \
    crate://crates.io/env_logger/0.10.2 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.9 \
    crate://crates.io/fastrand/2.1.0 \
    crate://crates.io/fixedbitset/0.4.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/futures-channel/0.3.30 \
    crate://crates.io/futures-core/0.3.30 \
    crate://crates.io/futures-executor/0.3.30 \
    crate://crates.io/futures-io/0.3.30 \
    crate://crates.io/futures-macro/0.3.30 \
    crate://crates.io/futures-sink/0.3.30 \
    crate://crates.io/futures-task/0.3.30 \
    crate://crates.io/futures-timer/3.0.3 \
    crate://crates.io/futures-util/0.3.30 \
    crate://crates.io/futures/0.3.30 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.2.15 \
    crate://crates.io/gimli/0.29.0 \
    crate://crates.io/gio-sys/0.19.5 \
    crate://crates.io/glib-macros/0.19.7 \
    crate://crates.io/glib-sys/0.19.5 \
    crate://crates.io/glib/0.19.7 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/gobject-sys/0.19.5 \
    crate://crates.io/governor/0.6.3 \
    crate://crates.io/gstreamer-app-sys/0.22.5 \
    crate://crates.io/gstreamer-app/0.22.0 \
    crate://crates.io/gstreamer-audio-sys/0.22.5 \
    crate://crates.io/gstreamer-audio/0.22.5 \
    crate://crates.io/gstreamer-base-sys/0.22.5 \
    crate://crates.io/gstreamer-base/0.22.0 \
    crate://crates.io/gstreamer-sys/0.22.5 \
    crate://crates.io/gstreamer/0.22.5 \
    crate://crates.io/h2/0.4.5 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/headers-core/0.3.0 \
    crate://crates.io/headers/0.4.0 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/hermit-abi/0.4.0 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hmac/0.12.1 \
    crate://crates.io/home/0.5.9 \
    crate://crates.io/hostname/0.4.0 \
    crate://crates.io/http-body-util/0.1.2 \
    crate://crates.io/http-body/1.0.0 \
    crate://crates.io/http/1.1.0 \
    crate://crates.io/httparse/1.9.2 \
    crate://crates.io/httpdate/1.0.3 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-proxy2/0.1.0 \
    crate://crates.io/hyper-rustls/0.26.0 \
    crate://crates.io/hyper-util/0.1.5 \
    crate://crates.io/hyper/1.3.1 \
    crate://crates.io/icu_collections/1.5.0 \
    crate://crates.io/icu_locid/1.5.0 \
    crate://crates.io/icu_locid_transform/1.5.0 \
    crate://crates.io/icu_locid_transform_data/1.5.0 \
    crate://crates.io/icu_normalizer/1.5.0 \
    crate://crates.io/icu_normalizer_data/1.5.0 \
    crate://crates.io/icu_properties/1.5.0 \
    crate://crates.io/icu_properties_data/1.5.0 \
    crate://crates.io/icu_provider/1.5.0 \
    crate://crates.io/icu_provider_macros/1.5.0 \
    crate://crates.io/idna/1.0.0 \
    crate://crates.io/if-addrs/0.12.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indexmap/2.2.6 \
    crate://crates.io/inout/0.1.3 \
    crate://crates.io/is-terminal/0.4.13 \
    crate://crates.io/itertools/0.12.1 \
    crate://crates.io/itertools/0.13.0 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/jack-sys/0.5.1 \
    crate://crates.io/jack/0.11.4 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni/0.21.1 \
    crate://crates.io/jobserver/0.1.31 \
    crate://crates.io/js-sys/0.3.69 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.155 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/libloading/0.8.3 \
    crate://crates.io/libm/0.2.8 \
    crate://crates.io/libmdns/0.9.1 \
    crate://crates.io/libpulse-binding/2.28.1 \
    crate://crates.io/libpulse-simple-binding/2.28.1 \
    crate://crates.io/libpulse-simple-sys/1.21.1 \
    crate://crates.io/libpulse-sys/1.21.0 \
    crate://crates.io/linux-raw-sys/0.4.14 \
    crate://crates.io/litemap/0.7.3 \
    crate://crates.io/lock_api/0.4.12 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/mach2/0.4.2 \
    crate://crates.io/memchr/2.7.2 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.3 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/muldiv/1.0.1 \
    crate://crates.io/multimap/0.10.0 \
    crate://crates.io/ndk-context/0.1.1 \
    crate://crates.io/ndk-sys/0.5.0+25.2.9519653 \
    crate://crates.io/ndk/0.8.0 \
    crate://crates.io/no-std-compat/0.4.1 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/nonzero_ext/0.3.0 \
    crate://crates.io/ntapi/0.4.1 \
    crate://crates.io/num-bigint-dig/0.8.4 \
    crate://crates.io/num-bigint/0.4.5 \
    crate://crates.io/num-conv/0.1.0 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-derive/0.4.2 \
    crate://crates.io/num-integer/0.1.46 \
    crate://crates.io/num-iter/0.1.45 \
    crate://crates.io/num-rational/0.4.2 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/num_enum/0.7.2 \
    crate://crates.io/num_enum_derive/0.7.2 \
    crate://crates.io/num_threads/0.1.7 \
    crate://crates.io/object/0.35.0 \
    crate://crates.io/oboe-sys/0.6.1 \
    crate://crates.io/oboe/0.6.1 \
    crate://crates.io/ogg/0.9.1 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/option-operations/0.5.0 \
    crate://crates.io/parking_lot/0.12.3 \
    crate://crates.io/parking_lot_core/0.9.10 \
    crate://crates.io/paste/1.0.15 \
    crate://crates.io/pbkdf2/0.12.2 \
    crate://crates.io/pem-rfc7468/0.7.0 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/petgraph/0.6.5 \
    crate://crates.io/pin-project-internal/1.1.5 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pin-project/1.1.5 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkcs1/0.7.5 \
    crate://crates.io/pkcs8/0.10.2 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/portable-atomic/1.6.0 \
    crate://crates.io/portaudio-rs/0.3.2 \
    crate://crates.io/portaudio-sys/0.1.1 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/priority-queue/2.0.3 \
    crate://crates.io/proc-macro-crate/3.1.0 \
    crate://crates.io/proc-macro2/1.0.85 \
    crate://crates.io/protobuf-codegen/3.4.0 \
    crate://crates.io/protobuf-parse/3.4.0 \
    crate://crates.io/protobuf-support/3.4.0 \
    crate://crates.io/protobuf/3.4.0 \
    crate://crates.io/quick-xml/0.32.0 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_distr/0.4.3 \
    crate://crates.io/redox_syscall/0.5.1 \
    crate://crates.io/regex-automata/0.4.7 \
    crate://crates.io/regex-syntax/0.8.4 \
    crate://crates.io/regex/1.10.5 \
    crate://crates.io/ring/0.17.8 \
    crate://crates.io/rodio/0.18.1 \
    crate://crates.io/rpassword/7.3.1 \
    crate://crates.io/rsa/0.9.6 \
    crate://crates.io/rtoolbox/0.0.2 \
    crate://crates.io/rustc-demangle/0.1.24 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustix/0.38.34 \
    crate://crates.io/rustls-native-certs/0.7.0 \
    crate://crates.io/rustls-pemfile/2.1.2 \
    crate://crates.io/rustls-pki-types/1.7.0 \
    crate://crates.io/rustls-webpki/0.102.4 \
    crate://crates.io/rustls/0.22.4 \
    crate://crates.io/rustls/0.23.9 \
    crate://crates.io/rustversion/1.0.17 \
    crate://crates.io/ryu/1.0.18 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.23 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/sdl2-sys/0.36.0 \
    crate://crates.io/sdl2/0.36.0 \
    crate://crates.io/security-framework-sys/2.11.0 \
    crate://crates.io/security-framework/2.11.0 \
    crate://crates.io/serde/1.0.203 \
    crate://crates.io/serde_derive/1.0.203 \
    crate://crates.io/serde_json/1.0.117 \
    crate://crates.io/serde_spanned/0.6.6 \
    crate://crates.io/sha1/0.10.6 \
    crate://crates.io/shannon/0.2.0 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/signal-hook-registry/1.4.2 \
    crate://crates.io/signature/2.2.0 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/socket2/0.5.7 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/spinning_top/0.3.0 \
    crate://crates.io/spki/0.7.3 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/subtle/2.5.0 \
    crate://crates.io/symphonia-bundle-mp3/0.5.4 \
    crate://crates.io/symphonia-codec-vorbis/0.5.4 \
    crate://crates.io/symphonia-core/0.5.4 \
    crate://crates.io/symphonia-format-ogg/0.5.4 \
    crate://crates.io/symphonia-metadata/0.5.4 \
    crate://crates.io/symphonia-utils-xiph/0.5.4 \
    crate://crates.io/symphonia/0.5.4 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.66 \
    crate://crates.io/synstructure/0.13.1 \
    crate://crates.io/sysinfo/0.30.12 \
    crate://crates.io/system-deps/6.2.2 \
    crate://crates.io/target-lexicon/0.12.14 \
    crate://crates.io/tempfile/3.10.1 \
    crate://crates.io/termcolor/1.4.1 \
    crate://crates.io/thiserror-impl/1.0.61 \
    crate://crates.io/thiserror/1.0.61 \
    crate://crates.io/thread-id/4.2.1 \
    crate://crates.io/time-core/0.1.2 \
    crate://crates.io/time-macros/0.2.18 \
    crate://crates.io/time/0.3.36 \
    crate://crates.io/tinystr/0.7.6 \
    crate://crates.io/tokio-macros/2.3.0 \
    crate://crates.io/tokio-rustls/0.25.0 \
    crate://crates.io/tokio-rustls/0.26.0 \
    crate://crates.io/tokio-stream/0.1.15 \
    crate://crates.io/tokio-tungstenite/0.23.0 \
    crate://crates.io/tokio-util/0.7.11 \
    crate://crates.io/tokio/1.38.0 \
    crate://crates.io/toml/0.8.14 \
    crate://crates.io/toml_datetime/0.6.6 \
    crate://crates.io/toml_edit/0.21.1 \
    crate://crates.io/toml_edit/0.22.14 \
    crate://crates.io/tower-layer/0.3.2 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tower/0.4.13 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/tungstenite/0.23.0 \
    crate://crates.io/typenum/1.17.0 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-width/0.1.13 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/url/2.5.1 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/utf16_iter/1.0.5 \
    crate://crates.io/utf8_iter/1.0.4 \
    crate://crates.io/uuid/1.8.0 \
    crate://crates.io/vergen/8.3.1 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version-compare/0.2.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.92 \
    crate://crates.io/wasm-bindgen-futures/0.4.42 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
    crate://crates.io/wasm-bindgen-macro/0.2.92 \
    crate://crates.io/wasm-bindgen-shared/0.2.92 \
    crate://crates.io/wasm-bindgen/0.2.92 \
    crate://crates.io/web-sys/0.3.69 \
    crate://crates.io/webpki/0.22.4 \
    crate://crates.io/which/4.4.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.8 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-core/0.54.0 \
    crate://crates.io/windows-result/0.1.2 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.5 \
    crate://crates.io/windows/0.52.0 \
    crate://crates.io/windows/0.54.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.5 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.5 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.5 \
    crate://crates.io/windows_i686_gnullvm/0.52.5 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.5 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.5 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.5 \
    crate://crates.io/winnow/0.5.40 \
    crate://crates.io/winnow/0.6.13 \
    crate://crates.io/write16/1.0.0 \
    crate://crates.io/writeable/0.5.5 \
    crate://crates.io/yoke-derive/0.7.4 \
    crate://crates.io/yoke/0.7.4 \
    crate://crates.io/zerocopy-derive/0.7.34 \
    crate://crates.io/zerocopy/0.7.34 \
    crate://crates.io/zerofrom-derive/0.1.4 \
    crate://crates.io/zerofrom/0.1.4 \
    crate://crates.io/zeroize/1.8.1 \
    crate://crates.io/zerovec-derive/0.10.3 \
    crate://crates.io/zerovec/0.10.4 \
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

DEPENDS += " alsa-lib avahi"
RDEPENDS:${PN} = " libavahi-compat-libdnssd"
CARGO_BUILD_FLAGS += '--features "alsa-backend" --features "with-dns-sd"'