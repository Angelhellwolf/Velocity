/*
 * Copyright (C) 2018-2023 Velocity Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.velocitypowered.proxy.config;

import java.util.Locale;

/**
 * Controls whether Velocity should defer routing decisions to ServerManager.
 */
public enum ServerManagerRoutingMode {
  AUTO,
  ON,
  OFF;

  /**
   * Parses the configured routing mode.
   *
   * @param value the configured value
   * @return the matching routing mode, or {@link #AUTO} if invalid
   */
  public static ServerManagerRoutingMode parse(String value) {
    if (value == null || value.isBlank()) {
      return AUTO;
    }

    try {
      return valueOf(value.trim().toUpperCase(Locale.ROOT));
    } catch (IllegalArgumentException ignored) {
      return AUTO;
    }
  }
}
