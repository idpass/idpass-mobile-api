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

import android.content.Intent
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.util.Base64
import org.idpass.mobile.proto.SignedAction

class IDPassIntent {

    companion object {
        @JvmStatic
        fun intentInitialiseAgent(documentType: String = IDPassConstants.IDPASS_TYPE_QR_CODE,
                                  logAction: Boolean = false): Intent {
            val intent = Intent(IDPassConstants.IDPASS_IDENTIFY_INTENT)
            intent.putExtra(IDPassConstants.IDPASS_IDPASS_TYPE_EXTRA, documentType)
            intent.putExtra(IDPassConstants.IDPASS_SET_AGENT_EXTRA, true)
            intent.putExtra(IDPassConstants.IDPASS_CAN_SKIP_BIO_EXTRA, -1)
            intent.putExtra(IDPassConstants.IDPASS_LOG_SIGNED_ACTION_RESULT_EXTRA, logAction)
            return intent
        }

        @JvmStatic
        fun intentIdentify(documentType: String = IDPassConstants.IDPASS_TYPE_QR_CODE,
                           includeLocation: Boolean = false,
                           logAction: Boolean = false,
                           tag: Tag? = null): Intent {
            val intent = Intent(IDPassConstants.IDPASS_IDENTIFY_INTENT)
            intent.putExtra(IDPassConstants.IDPASS_IDPASS_TYPE_EXTRA, documentType)
            intent.putExtra(IDPassConstants.IDPASS_INCLUDE_LOCATION_EXTRA, includeLocation)
            intent.putExtra(IDPassConstants.IDPASS_SET_AGENT_EXTRA, false)
            intent.putExtra(IDPassConstants.IDPASS_LOG_SIGNED_ACTION_RESULT_EXTRA, logAction)
            intent.putExtra(NfcAdapter.EXTRA_TAG, tag)
            return intent
        }

        @JvmStatic
        fun intentEnroll(finger: String,
                         name: String,
                         backup: Boolean = true,
                         write_to_mifare: Boolean = false,
                         logAction: Boolean = false): Intent {
            val intent = Intent(IDPassConstants.IDPASS_ENROLL_INTENT)
            intent.putExtra(IDPassConstants.IDPASS_FINGER_EXTRA, finger)
            intent.putExtra(IDPassConstants.IDPASS_NAME_EXTRA, name)
            intent.putExtra(IDPassConstants.IDPASS_CARD_BACKUP_EXTRA, backup)
            intent.putExtra(IDPassConstants.IDPASS_WRITE_TO_MIFARE_EXTRA, write_to_mifare)
            intent.putExtra(IDPassConstants.IDPASS_LOG_SIGNED_ACTION_RESULT_EXTRA, logAction)
            return intent
        }

        @JvmStatic
        fun signedActionBuilder(payload: String): SignedAction {
            return SignedAction.parseFrom(Base64.decode(payload, Base64.NO_WRAP))
        }
    }
}
