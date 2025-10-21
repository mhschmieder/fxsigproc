/*
 * MIT License
 *
 * Copyright (c) 2020, 2025 Mark Schmieder
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is part of the FxSigProc Library
 *
 * You should have received a copy of the MIT License along with the
 * FxSigProc Library. If not, see <https://opensource.org/licenses/MIT>.
 *
 * Project: https://github.com/mhschmieder/fxsigproc
 */
package com.mhschmieder.fxsigproc.action;

import com.mhschmieder.fxguitoolkit.action.ActionFactory;
import com.mhschmieder.fxguitoolkit.action.XAction;
import com.mhschmieder.jcommons.util.ClientProperties;

public class SigprocLabeledActionFactory {

    // NOTE: We must substitute "." for resource directory tree delimiters.
    public static final String BUNDLE_NAME = "properties.SigprocActionLabels";

    /**
     * The default constructor is disabled, as this is a static factory class.
     */
   private SigprocLabeledActionFactory() {}

   public static XAction getProcessorInvertedCheck( final ClientProperties clientProperties ) {
       return ActionFactory.makeCheck( clientProperties,
                                       BUNDLE_NAME,
                                       "view",
                                       "processorInverted",
                                       "/icons/yusukeKamiyamane/Function16.png",
                                       true );
   }
}
