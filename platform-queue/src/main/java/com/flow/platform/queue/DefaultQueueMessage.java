/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.queue;

/**
 * @author yang
 */
public class DefaultQueueMessage implements PriorityQueueItem {

    private final byte[] body;

    private Long priority;

    private Long timestamp;

    public DefaultQueueMessage(byte[] body, Long priority) {
        this.body = body;
        this.priority = priority;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public Long getPriority() {
        return priority;
    }

    @Override
    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public byte[] getBody() {
        return body;
    }

    @Override
    public int compareTo(PriorityQueueItem o) {
        return COMPARATOR.compare(this, o);
    }
}
