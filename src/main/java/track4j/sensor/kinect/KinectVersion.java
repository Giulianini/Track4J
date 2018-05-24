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

/**
 * The @link{KinectVersion} class.
 */
public enum KinectVersion {

    /**
     * Kinect first version.
     */
    KINECT1((byte) 0x1),
    /**
     * Kinect second version.
     */
    KINECT2((byte) 0x2);

    private byte version;

    /**
     * The @link{KinectVersion.java} constructor.
     *
     * @param kinectVersion
     *            the kinect version
     */
    KinectVersion(final byte kinectVersion) {
        this.version = kinectVersion;
    }

    /**
     * Get the @link{version}.
     *
     * @return the @link{version}
     */
    public byte getVersion() {
        return this.version;
    }

}
