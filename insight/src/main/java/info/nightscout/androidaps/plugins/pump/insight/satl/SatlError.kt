package info.nightscout.androidaps.plugins.pump.insight.satl

import info.nightscout.androidaps.plugins.pump.insight.descriptors.BasalProfile

enum class SatlError (val id: Byte) {
    UNDEFINED (0.toByte()),
    INCOMPATIBLE_VERSION (1.toByte()),
    INVALID_COMM_ID (2.toByte()),
    INVALID_MAC_TRAILER (3.toByte()),
    INVALID_CRC (4.toByte()),
    INVALID_PACKET (5.toByte()),
    INVALID_NONCE (6.toByte()),
    DECRYPT_VERIFY_FAILED (7.toByte()),
    COMPATIBLE_STATE (8.toByte()),
    WRONG_STATE (0x0F.toByte()),
    INVALID_MESSAGE_TYPE (51.toByte()),
    INVALID_PAYLOAD_LENGTH (60.toByte()),
    NONE (255.toByte());

    companion object {
        fun fromId(id: Byte) = values().firstOrNull { it.id == id } ?: null
    }
}