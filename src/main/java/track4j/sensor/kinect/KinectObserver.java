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

package track4j.sensor.kinect;

import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

/**
 * The @link{ObservableKinect} class. Kinect Adapter notify Kinect throw this interface.
 */
interface KinectObserver {
    /**
     * Notify Kinect on skeleton change.
     *
     * @param primaryJoint
     *            the {@link Vector2D} primary joint used in gesture recognition
     * @param secondaryJoint
     *            the {@link Vector2D} secondary joint used in gesture recognition
     */
    void notifyOnSkeletonChange(Vector2D primaryJoint, Vector2D secondaryJoint);

    /**
     * Notify Kinect on accelerometer change.
     *
     * @param acceleration
     *            the {@link Vector3D} acceleration
     */
    void notifyOnAccelerometerChange(Vector3D acceleration);
}
