/*
 * MIT License
 *
 * Copyright (c) 2018 Martin Melka
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cz.melkamar.andruian.ddfparser.model;

public class IndexServer {
    private final String uri;
    private final int version;
    private final boolean versionSet;

    public IndexServer(String uri, int version) {
        this.uri = uri;
        this.versionSet = true;
        this.version = version;
    }

    public IndexServer(String uri) {
        this.uri = uri;
        this.versionSet = false;
        this.version = -1;
    }

    public String getUri() {
        return uri;
    }

    /**
     * Return a version associated with the index server. Return -1 if version not set.
     *
     * Call {@link IndexServer#isVersionSet()} to check if a version was set.
     */
    public int getVersion() {
        return version;
    }

    public boolean isVersionSet() {
        return versionSet;
    }
}
