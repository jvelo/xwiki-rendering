/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.renderer.xml;

import java.util.Collection;

import org.xml.sax.ContentHandler;
import org.xwiki.component.annotation.ComponentRole;
import org.xwiki.rendering.block.Block;

/**
 * Convert {@link Block}s into SAX events.
 * 
 * @version $Id$
 * @since 3.3M1
 */
@ComponentRole
public interface ContentHandlerBlockRenderer
{
    /**
     * @param block the block to render in the target syntax
     * @param contentHandler the object to send SAX event to
     */
    void render(Block block, ContentHandler contentHandler);

    /**
     * @param blocks the list of blocks to render in the target syntax
     * @param contentHandler the object to send SAX event to
     * @todo remove this API once we introduce the notion of BlockCollection
     */
    void render(Collection<Block> blocks, ContentHandler contentHandler);
}
