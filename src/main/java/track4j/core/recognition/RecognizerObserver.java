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

package track4j.core.recognition;

import java.util.Queue;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

/**
 * The @link{ObservableCoreRecognizer} class.
 */
public interface RecognizerObserver {
    /**
     * Notify the {@link Recognizer} when a feature vector {@link Queue} is avaiable.
     *
     * @param featureVector
     *            the {@link Queue} feature vector.
     */
    void notifyOnFeatureVectorEvent(Queue<Vector2D> featureVector);

    /**
     * Notify the {@link Recognizer} when a frame changes.
     *
     * @param frame
     *            the frame
     * @param vector
     *            the derivative vector
     * @param startingVector
     *            the starting vector
     */
    void notifyOnFrameChange(int frame, Vector2D vector, Vector2D startingVector);

}
