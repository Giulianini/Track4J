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

package track4j.core.tracking;

import track4j.core.codification.FrameLenght;
import track4j.core.view.View;
import track4j.sensor.Sensor;

/**
 * Inteface for tracking.
 *
 *
 */
public interface Tracking {

    /**
     * Attache the listener.
     *
     * @param listener
     *            the listener
     */
    void setOnJointTracked(JointListener listener);

    /**
     * Attache the {@link Sensor}.
     *
     * @param sensor
     *            the {@link Sensor}
     */
    void attacheSensor(Sensor sensor);

    /**
     * Attache the view.
     *
     * @param view
     *            the {@link View}
     */
    void attacheUI(View view);

    /**
     * The sensor is started.
     *
     * @return <code>true</code> if the sensor is started.
     */
    boolean isStarted();

    /**
     * Set the frame length.
     *
     * @param length
     *            the length
     */
    void setFrameLength(FrameLenght length);

    /**
     * Get the frame length.
     *
     * @return the frame length in frame
     */
    int getFrameLength();

    /**
     * Start the sensor.
     */
    void startSensor();

    /**
     * Stop the sensor.
     */
    void stopSensor();

    /**
     * Sensor state.
     * 
     * @return <code>true</code> if it's on
     */
    boolean state();

}