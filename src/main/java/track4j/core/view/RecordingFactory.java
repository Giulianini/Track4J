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

package track4j.core.view;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

/**
 * Factory for recording view.
 *
 */
final class RecordingFactory {
    private RecordingFactory() {
    }

    public static LineChart<Number, Number> createDerivativeLineChart() {
        final NumberAxis x2Axis = new NumberAxis("Space", -100, 100, 1);
        final NumberAxis x1Axis = new NumberAxis("Time", 0, 90, 1);
        final LineChart<Number, Number> lineChart = new LineChart<>(x1Axis, x2Axis);
        lineChart.getYAxis().setAutoRanging(false);
        lineChart.getYAxis().setAutoRanging(false);
        lineChart.setAnimated(false);
        return lineChart;
    }
}