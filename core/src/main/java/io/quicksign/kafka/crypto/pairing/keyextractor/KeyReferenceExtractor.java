/*-
 * #%L
 * Kafka Encryption
 * %%
 * Copyright (C) 2018 Quicksign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.quicksign.kafka.crypto.pairing.keyextractor;

/**
 * Used at encryption time to compute the keyref associated to the message key.
 * <p>
 * The choice of a {@link KeyReferenceExtractor} has to be done accordingly
 * to the chosen {@link io.quicksign.kafka.crypto.encryption.KeyProvider KeyProvider}
 *
 * @see io.quicksign.kafka.crypto.encryption.KeyProvider
 */
public interface KeyReferenceExtractor {

    /**
     * Compute the key reference for a message
     *
     * @param topic the topic name on which the message is about to be published
     * @param key   the message key (in nominal case)
     * @return the keyref
     */
    byte[] extractKeyReference(String topic, Object key);
}
