/*
 * Copyright 2019 Newlogic Impact Lab Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.idpass.mobile.api

object IDPassConstants {
    const val IDPASS_TYPE_QR_CODE = "QR_CODE"
    const val PUBLIC_KEY_ED25519_PREFIX = "IDP01"

    const val IDPASS_TYPE_MIFARE = "MIFARE"
    const val IDPASS_TYPE_IDPASS_CARD_V1 = "IDPASS_CARD_V1"

    // Intents
    const val IDPASS_IDENTIFY_INTENT = "org.idpass.mobile.intents.IDENTIFY"
    const val IDPASS_IDENTIFY_RESULT_INTENT = "org.idpass.mobile.intents.IDENTIFY_RESULT"
    const val IDPASS_ENROLL_INTENT = "org.idpass.mobile.intents.ENROLL"
    const val IDPASS_ENROLL_RESULT_INTENT = "org.idpass.mobile.intents.ENROLL_RESULT"

    // Extras
    const val IDPASS_CARD_ENCRYPTED_EXTRA = "org.idpass.mobile.extra.CARD_ENCRYPTED"
    const val IDPASS_SIGNED_ACTION_RESULT_EXTRA = "org.idpass.mobile.extra.SIGNED_ACTION_RESULT"
    const val IDPASS_LOG_SIGNED_ACTION_RESULT_EXTRA = "org.idpass.mobile.extra.LOG_SIGNED_ACTION_RESULT"
    const val IDPASS_INCLUDE_LOCATION_EXTRA = "org.idpass.mobile.extra.INCLUDE_LOCATION"
    const val IDPASS_BIO_VERIFIED_EXTRA = "org.idpass.mobile.extra.BIO_VERIFIED"
    const val IDPASS_FINGER_EXTRA = "org.idpass.mobile.extra.FINGER"
    const val IDPASS_WRITE_TO_MIFARE_EXTRA = "org.idpass.mobile.extra.WRITE_TO_MIFARE"
    const val IDPASS_DID_EXTRA = "org.idpass.mobile.extra.DID"
    const val IDPASS_NAME_EXTRA = "org.idpass.mobile.extra.NAME"
    const val IDPASS_CARD_BACKUP_EXTRA = "org.idpass.mobile.extra.CARD_BACKUP"
    const val IDPASS_IDPASS_TYPE_EXTRA = "org.idpass.mobile.extra.IDPASS_TYPE"
    const val IDPASS_SET_AGENT_EXTRA = "org.idpass.mobile.extra.SET_AGENT"
}