/*******************************************************************************
 * Copyright (c) 2018 Giulianini Luca
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package track4j.sensor;

/**
 * The @link{IllegalSensorStateException} class.
 */
public class IllegalSensorStateException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * The @link{IllegalSensorStateException.java} constructor.
     */
    public IllegalSensorStateException() {
        super("Cannot start the sensor outside recognizer. Please attache it to recognizer and start the recognition");
    }

}
