
PACKAGECONFIG += " libdns_sd"
PACKAGECONFIG[libdns_sd] = "--enable-compat-libdns_sd --enable-dbus,,dbus"
PACKAGES =+ "${@bb.utils.contains('PACKAGECONFIG', 'libdns_sd', 'libavahi-compat-libdnssd-dev', '', d)}"

FILES_libavahi-compat-libdnssd-dev = "${libdir}/libdns_sd.* \
                                   ${libdir}/pkgconfig/avahi-compat-libdns_sd.pc"
RPROVIDES_libavahi-compat-libdnssd-dev = "libdns-sd"
