/*
Copyright (c) 2008~2009, Justin R. Bengtson (poopshotgun@yahoo.com)
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
        this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
        this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
    * Neither the name of Justin R. Bengtson nor the names of contributors may
        be used to endorse or promote products derived from this software
        without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package common;

public class Constants {
    public final static String LibVersion = "0.0.1",
                               BASELOADOUT_NAME = "Base Loadout",
                               WEAPONSFILE = "data/equipment/weapons.dat",
                               PHYSICALSFILE = "data/equipment/physicals.dat",
                               EQUIPMENTFILE = "data/equipment/equipment.dat",
                               AMMOFILE = "data/equipment/ammunition.dat";

    public final static String[] Locs = { "Head", "Center Torso", "Left Torso",
        "Right Torso", "Left Arm", "Right Arm", "Left Leg", "Right Leg" };

    public final static String Print_ForceList = "Print.ForceList",
                        Print_FireDeclaration = "Print.FireDeclaration",
                        Print_Recordsheet = "Print.Recordsheets",
                        Print_BattleForce = "Print.BattleForce",
                        Format_Recordsheet = "UseRS",
                        Format_Tables = "UseCharts",
                        Format_CanonPattern = "UseCanonDots",
                        Format_ConvertTerrain = "UseMiniConversion",
                        Format_TerrainModifier = "MiniConversionRate",
                        Format_OneForcePerPage = "OneForcePerPage",
                        Format_BattleForceSheetChoice = "BattleForceSheetIndex",
                        Format_RecordsheetChoice = "RecordsheetIndex";
}