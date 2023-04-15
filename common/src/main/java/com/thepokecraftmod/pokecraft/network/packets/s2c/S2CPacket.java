/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.thepokecraftmod.pokecraft.network.packets.s2c;

import com.thepokecraftmod.pokecraft.network.packets.GenericPacket;

public interface S2CPacket extends GenericPacket {

    /**
     * Runs outside the network thread. Any logic should happen here to avoid putting load on the network thread. Make sure to safely call {@link net.minecraft.client.Minecraft#tell(Runnable)} to run rendering code
     */
    void process();
}
