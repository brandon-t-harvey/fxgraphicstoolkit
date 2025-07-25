/**
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
 * This file is part of the FxGraphicsToolkit Library
 *
 * You should have received a copy of the MIT License along with the
 * FxGraphicsToolkit Library. If not, see <https://opensource.org/licenses/MIT>.
 *
 * Project: https://github.com/mhschmieder/fxgraphicstoolkit
 */
package com.mhschmieder.fxgraphicstoolkit.input;

import java.util.Locale;

/**
 * The <code>ScrollingSensitivity</code> enum is an enumeration of supported
 * mouse scrolling sensitivity levels.
 *
 * @version 1.0
 *
 * @author Mark Schmieder
 */
public enum ScrollingSensitivity {
    OFF, COARSE, MEDIUM, FINE;

    public static ScrollingSensitivity canonicalValueOf( final String canonicalScrollingSensitivity ) {
        return ( canonicalScrollingSensitivity != null )
            ? valueOf( canonicalScrollingSensitivity.toUpperCase( Locale.ENGLISH ) )
            : defaultValue();
    }

    public static ScrollingSensitivity defaultValue() {
        return OFF;
    }

    public final String toCanonicalString() {
        return toString().toLowerCase( Locale.ENGLISH );
    }
}
