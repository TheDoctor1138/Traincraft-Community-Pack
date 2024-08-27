//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.06.2022 - 13:56:48
// Last changed on: 18.06.2022 - 13:56:48



package tcce.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import train.common.api.Locomotive;

public class ModelDuewagT4ER extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDuewagT4ER() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[386];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 440, 212, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 358, 219, textureX, textureY); // Box 63
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 65
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 66
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 67
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 75
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 76
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 77
		bodyModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 79
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 80
		bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 81
		bodyModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY,"lamp"); // Sta_Light_1
		bodyModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY,"lamp"); // Sta_Light_2
		bodyModel[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY,"lamp"); // Sta_Light_4
		bodyModel[17] = new ModelRendererTurbo(this, 49, 1, textureX, textureY,"lamp"); // Sta_Light_3
		bodyModel[18] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 140
		bodyModel[19] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 142
		bodyModel[20] = new ModelRendererTurbo(this, 304, 217, textureX, textureY); // Box 145
		bodyModel[21] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[22] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 165
		bodyModel[23] = new ModelRendererTurbo(this, 385, 184, textureX, textureY); // Box 184
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 185
		bodyModel[25] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 186
		bodyModel[26] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 179
		bodyModel[27] = new ModelRendererTurbo(this, 310, 211, textureX, textureY); // Box 180
		bodyModel[28] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 181
		bodyModel[29] = new ModelRendererTurbo(this, 462, 234, textureX, textureY); // Box 182
		bodyModel[30] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 139
		bodyModel[32] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 141
		bodyModel[33] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 156
		bodyModel[34] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 294
		bodyModel[35] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 306
		bodyModel[36] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 323, 237, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 6
		bodyModel[40] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 294
		bodyModel[41] = new ModelRendererTurbo(this, 281, 33, textureX, textureY,"lamp"); // Box 170 lamp
		bodyModel[42] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 92
		bodyModel[43] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 93
		bodyModel[44] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 97
		bodyModel[45] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 98
		bodyModel[46] = new ModelRendererTurbo(this, 305, 184, textureX, textureY); // Box 99
		bodyModel[47] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 100
		bodyModel[48] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 104
		bodyModel[50] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 107
		bodyModel[51] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 109
		bodyModel[52] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 110
		bodyModel[53] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 111
		bodyModel[54] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 112
		bodyModel[55] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 113
		bodyModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 114
		bodyModel[57] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 115
		bodyModel[58] = new ModelRendererTurbo(this, 396, 182, textureX, textureY); // Box 117
		bodyModel[59] = new ModelRendererTurbo(this, 396, 206, textureX, textureY); // Box 118
		bodyModel[60] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 119
		bodyModel[61] = new ModelRendererTurbo(this, 319, 184, textureX, textureY); // Box 126
		bodyModel[62] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 129
		bodyModel[64] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 130
		bodyModel[65] = new ModelRendererTurbo(this, 329, 184, textureX, textureY); // Box 131
		bodyModel[66] = new ModelRendererTurbo(this, 338, 208, textureX, textureY); // Box 132
		bodyModel[67] = new ModelRendererTurbo(this, 338, 186, textureX, textureY); // Box 133
		bodyModel[68] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 135
		bodyModel[69] = new ModelRendererTurbo(this, 369, 184, textureX, textureY); // Box 136
		bodyModel[70] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 137
		bodyModel[71] = new ModelRendererTurbo(this, 377, 184, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 141
		bodyModel[74] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 147
		bodyModel[75] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 148
		bodyModel[76] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 149
		bodyModel[77] = new ModelRendererTurbo(this, 392, 214, textureX, textureY); // Box 150
		bodyModel[78] = new ModelRendererTurbo(this, 434, 213, textureX, textureY); // Box 151
		bodyModel[79] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 152
		bodyModel[80] = new ModelRendererTurbo(this, 382, 176, textureX, textureY); // Box 158
		bodyModel[81] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 165
		bodyModel[82] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 166
		bodyModel[83] = new ModelRendererTurbo(this, 89, 81, textureX, textureY,"lamp"); // Box 167 lamp
		bodyModel[84] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 168
		bodyModel[85] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 169
		bodyModel[86] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 170
		bodyModel[87] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 171
		bodyModel[88] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 173
		bodyModel[89] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 174
		bodyModel[90] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 175
		bodyModel[91] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 176
		bodyModel[92] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 177
		bodyModel[93] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 178
		bodyModel[94] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 179
		bodyModel[95] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 180
		bodyModel[96] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 181
		bodyModel[97] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 182
		bodyModel[98] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 184
		bodyModel[99] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 185
		bodyModel[100] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 186
		bodyModel[101] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 190
		bodyModel[102] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 226
		bodyModel[103] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 227
		bodyModel[104] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 228
		bodyModel[105] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 195
		bodyModel[106] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 197
		bodyModel[107] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 207
		bodyModel[108] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 208
		bodyModel[109] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 209
		bodyModel[110] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 211
		bodyModel[111] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 8
		bodyModel[113] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 9
		bodyModel[114] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 10
		bodyModel[115] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 11
		bodyModel[116] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 12
		bodyModel[117] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 13
		bodyModel[118] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 15
		bodyModel[119] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 19
		bodyModel[120] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 21
		bodyModel[121] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 24
		bodyModel[122] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 127
		bodyModel[125] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 129
		bodyModel[127] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 131
		bodyModel[129] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 126
		bodyModel[130] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 449
		bodyModel[131] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 450
		bodyModel[132] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 385
		bodyModel[133] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 386
		bodyModel[134] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 388
		bodyModel[135] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 389
		bodyModel[136] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 391
		bodyModel[137] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 394
		bodyModel[138] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 399
		bodyModel[139] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 400
		bodyModel[140] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 401
		bodyModel[141] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 405
		bodyModel[142] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 408
		bodyModel[143] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 410
		bodyModel[144] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 414
		bodyModel[145] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 419
		bodyModel[146] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 426
		bodyModel[147] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 427
		bodyModel[148] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 431
		bodyModel[149] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 434
		bodyModel[150] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 436
		bodyModel[151] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 24
		bodyModel[152] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 457
		bodyModel[153] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 458
		bodyModel[154] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 461
		bodyModel[155] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 268
		bodyModel[156] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 269
		bodyModel[157] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 65
		bodyModel[158] = new ModelRendererTurbo(this, 449, 25, textureX, textureY,"lamp"); // Box 277 lamp
		bodyModel[159] = new ModelRendererTurbo(this, 505, 25, textureX, textureY,"lamp"); // Box 278 lamp
		bodyModel[160] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 279
		bodyModel[161] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 280
		bodyModel[162] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 281
		bodyModel[163] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 282
		bodyModel[164] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 283
		bodyModel[165] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 284
		bodyModel[166] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 285
		bodyModel[167] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 286
		bodyModel[168] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 290
		bodyModel[169] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 291
		bodyModel[170] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 292
		bodyModel[171] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 293
		bodyModel[172] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 294
		bodyModel[173] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 295
		bodyModel[174] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 296
		bodyModel[175] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 297
		bodyModel[176] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 298
		bodyModel[177] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 300
		bodyModel[178] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 303
		bodyModel[179] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 304
		bodyModel[180] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 305
		bodyModel[181] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 306
		bodyModel[182] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 308
		bodyModel[183] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 311
		bodyModel[184] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 312
		bodyModel[185] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 314
		bodyModel[186] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 316
		bodyModel[187] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 319
		bodyModel[188] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 320
		bodyModel[189] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 322
		bodyModel[190] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 323
		bodyModel[191] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 324
		bodyModel[192] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 325
		bodyModel[193] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 326
		bodyModel[194] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 327
		bodyModel[195] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 328
		bodyModel[196] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 329
		bodyModel[197] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 330
		bodyModel[198] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 331
		bodyModel[199] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 332
		bodyModel[200] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 333
		bodyModel[201] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 334
		bodyModel[202] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 335
		bodyModel[203] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 336
		bodyModel[204] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 337
		bodyModel[205] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 338
		bodyModel[206] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 339
		bodyModel[207] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 340
		bodyModel[208] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 341
		bodyModel[209] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 342
		bodyModel[210] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 343
		bodyModel[211] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 344
		bodyModel[212] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 345
		bodyModel[213] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 346
		bodyModel[214] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 347
		bodyModel[215] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 348
		bodyModel[216] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 349
		bodyModel[217] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 352
		bodyModel[218] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 356
		bodyModel[219] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 360
		bodyModel[220] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 375
		bodyModel[221] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 376
		bodyModel[222] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 377
		bodyModel[223] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 378
		bodyModel[224] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 379
		bodyModel[225] = new ModelRendererTurbo(this, 267, 122, textureX, textureY); // Box 239
		bodyModel[226] = new ModelRendererTurbo(this, 267, 130, textureX, textureY); // Box 325
		bodyModel[227] = new ModelRendererTurbo(this, 476, 100, textureX, textureY); // Box 325
		bodyModel[228] = new ModelRendererTurbo(this, 495, 101, textureX, textureY); // Box 326
		bodyModel[229] = new ModelRendererTurbo(this, 223, 92, textureX, textureY,"lamp"); // Box 328 lamp
		bodyModel[230] = new ModelRendererTurbo(this, 495, 115, textureX, textureY); // Box 333
		bodyModel[231] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 337
		bodyModel[232] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 338
		bodyModel[233] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 339
		bodyModel[234] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 340
		bodyModel[235] = new ModelRendererTurbo(this, 396, 195, textureX, textureY); // Box 333
		bodyModel[236] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 335
		bodyModel[237] = new ModelRendererTurbo(this, 169, 38, textureX, textureY); // Box 336
		bodyModel[238] = new ModelRendererTurbo(this, 414, 213, textureX, textureY); // Box 337
		bodyModel[239] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 338
		bodyModel[240] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 339
		bodyModel[241] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 340
		bodyModel[242] = new ModelRendererTurbo(this, 414, 221, textureX, textureY); // Box 341
		bodyModel[243] = new ModelRendererTurbo(this, 414, 245, textureX, textureY); // Box 342
		bodyModel[244] = new ModelRendererTurbo(this, 414, 218, textureX, textureY); // Box 343
		bodyModel[245] = new ModelRendererTurbo(this, 483, 235, textureX, textureY); // Box 345
		bodyModel[246] = new ModelRendererTurbo(this, 483, 224, textureX, textureY); // Box 346
		bodyModel[247] = new ModelRendererTurbo(this, 483, 211, textureX, textureY); // Box 347
		bodyModel[248] = new ModelRendererTurbo(this, 500, 211, textureX, textureY); // Box 348
		bodyModel[249] = new ModelRendererTurbo(this, 500, 234, textureX, textureY); // Box 349
		bodyModel[250] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 350
		bodyModel[251] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 351
		bodyModel[252] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 352
		bodyModel[253] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 353
		bodyModel[254] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 354
		bodyModel[255] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 355
		bodyModel[256] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 356
		bodyModel[257] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 357
		bodyModel[258] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 358
		bodyModel[259] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 359
		bodyModel[260] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 360
		bodyModel[261] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 361
		bodyModel[262] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 362
		bodyModel[263] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 363
		bodyModel[264] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 364
		bodyModel[265] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 365
		bodyModel[266] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 366
		bodyModel[267] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 367
		bodyModel[268] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 368
		bodyModel[269] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 369
		bodyModel[270] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 370
		bodyModel[271] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 371
		bodyModel[272] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 372
		bodyModel[273] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 373
		bodyModel[274] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 374
		bodyModel[275] = new ModelRendererTurbo(this, 314, 242, textureX, textureY); // Box 375
		bodyModel[276] = new ModelRendererTurbo(this, 321, 238, textureX, textureY); // Box 376
		bodyModel[277] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 377
		bodyModel[278] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 378
		bodyModel[279] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 379
		bodyModel[280] = new ModelRendererTurbo(this, 326, 245, textureX, textureY); // Box 380
		bodyModel[281] = new ModelRendererTurbo(this, 41, 1, textureX, textureY,"lamp"); // Box 381 lamp
		bodyModel[282] = new ModelRendererTurbo(this, 41, 1, textureX, textureY,"lamp"); // Box 382 lamp
		bodyModel[283] = new ModelRendererTurbo(this, 41, 1, textureX, textureY,"lamp"); // Box 383 lamp
		bodyModel[284] = new ModelRendererTurbo(this, 41, 1, textureX, textureY,"lamp"); // Box 384 lamp
		bodyModel[285] = new ModelRendererTurbo(this, 41, 5, textureX, textureY,"lamp"); // Box 385 lamp
		bodyModel[286] = new ModelRendererTurbo(this, 41, 5, textureX, textureY,"lamp"); // Box 386 lamp
		bodyModel[287] = new ModelRendererTurbo(this, 41, 5, textureX, textureY,"lamp"); // Box 387 lamp
		bodyModel[288] = new ModelRendererTurbo(this, 41, 5, textureX, textureY,"lamp"); // Box 388 lamp
		bodyModel[289] = new ModelRendererTurbo(this, 49, 5, textureX, textureY,"lamp"); // Box 389 lamp
		bodyModel[290] = new ModelRendererTurbo(this, 49, 5, textureX, textureY,"lamp"); // Box 390 lamp
		bodyModel[291] = new ModelRendererTurbo(this, 49, 5, textureX, textureY,"lamp"); // Box 391 lamp
		bodyModel[292] = new ModelRendererTurbo(this, 49, 5, textureX, textureY,"lamp"); // Box 392 lamp
		bodyModel[293] = new ModelRendererTurbo(this, 505, 23, textureX, textureY); // Box 323
		bodyModel[294] = new ModelRendererTurbo(this, 449, 23, textureX, textureY); // Box 324
		bodyModel[295] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 377
		bodyModel[296] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 378
		bodyModel[297] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 379
		bodyModel[298] = new ModelRendererTurbo(this, 19, 198, textureX, textureY); // Box 380
		bodyModel[299] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 381
		bodyModel[300] = new ModelRendererTurbo(this, 2, 196, textureX, textureY); // Box 382
		bodyModel[301] = new ModelRendererTurbo(this, 2, 212, textureX, textureY); // Box 304
		bodyModel[302] = new ModelRendererTurbo(this, 19, 212, textureX, textureY); // Box 305
		bodyModel[303] = new ModelRendererTurbo(this, 2, 212, textureX, textureY); // Box 306
		bodyModel[304] = new ModelRendererTurbo(this, 2, 212, textureX, textureY); // Box 307
		bodyModel[305] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 30
		bodyModel[306] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 31
		bodyModel[307] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 32
		bodyModel[308] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 33
		bodyModel[309] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 331
		bodyModel[310] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 332
		bodyModel[311] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 336
		bodyModel[312] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 337
		bodyModel[313] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 338
		bodyModel[314] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 344
		bodyModel[315] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 345
		bodyModel[316] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 346
		bodyModel[317] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Box 336
		bodyModel[318] = new ModelRendererTurbo(this, 4, 120, textureX, textureY); // Box 337
		bodyModel[319] = new ModelRendererTurbo(this, 295, 154, textureX, textureY); // Box 367
		bodyModel[320] = new ModelRendererTurbo(this, 303, 151, textureX, textureY); // Box 368
		bodyModel[321] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Box 369
		bodyModel[322] = new ModelRendererTurbo(this, 318, 154, textureX, textureY); // Box 376
		bodyModel[323] = new ModelRendererTurbo(this, 311, 151, textureX, textureY); // Box 313
		bodyModel[324] = new ModelRendererTurbo(this, 311, 154, textureX, textureY); // Box 315
		bodyModel[325] = new ModelRendererTurbo(this, 235, 147, textureX, textureY); // Box 615
		bodyModel[326] = new ModelRendererTurbo(this, 302, 147, textureX, textureY); // Box 617
		bodyModel[327] = new ModelRendererTurbo(this, 316, 147, textureX, textureY); // Box 618
		bodyModel[328] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 414
		bodyModel[329] = new ModelRendererTurbo(this, 249, 141, textureX, textureY); // Box 417
		bodyModel[330] = new ModelRendererTurbo(this, 266, 147, textureX, textureY); // Box 411
		bodyModel[331] = new ModelRendererTurbo(this, 280, 147, textureX, textureY); // Box 366
		bodyModel[332] = new ModelRendererTurbo(this, 273, 147, textureX, textureY); // Box 367
		bodyModel[333] = new ModelRendererTurbo(this, 235, 147, textureX, textureY); // Box 340
		bodyModel[334] = new ModelRendererTurbo(this, 302, 147, textureX, textureY); // Box 341
		bodyModel[335] = new ModelRendererTurbo(this, 318, 154, textureX, textureY); // Box 342
		bodyModel[336] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Box 343
		bodyModel[337] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Box 344
		bodyModel[338] = new ModelRendererTurbo(this, 300, 154, textureX, textureY); // Box 345
		bodyModel[339] = new ModelRendererTurbo(this, 311, 154, textureX, textureY); // Box 346
		bodyModel[340] = new ModelRendererTurbo(this, 297, 151, textureX, textureY); // Box 347
		bodyModel[341] = new ModelRendererTurbo(this, 297, 151, textureX, textureY); // Box 348
		bodyModel[342] = new ModelRendererTurbo(this, 311, 154, textureX, textureY); // Box 349
		bodyModel[343] = new ModelRendererTurbo(this, 260, 145, textureX, textureY); // Box 348
		bodyModel[344] = new ModelRendererTurbo(this, 249, 141, textureX, textureY); // Box 349
		bodyModel[345] = new ModelRendererTurbo(this, 266, 147, textureX, textureY); // Box 350
		bodyModel[346] = new ModelRendererTurbo(this, 280, 147, textureX, textureY); // Box 351
		bodyModel[347] = new ModelRendererTurbo(this, 273, 147, textureX, textureY); // Box 352
		bodyModel[348] = new ModelRendererTurbo(this, 423, 147, textureX, textureY); // Box 353
		bodyModel[349] = new ModelRendererTurbo(this, 316, 147, textureX, textureY); // Box 356
		bodyModel[350] = new ModelRendererTurbo(this, 248, 151, textureX, textureY); // Box 357
		bodyModel[351] = new ModelRendererTurbo(this, 264, 151, textureX, textureY); // Box 358
		bodyModel[352] = new ModelRendererTurbo(this, 42, 221, textureX, textureY); // Box 46
		bodyModel[353] = new ModelRendererTurbo(this, 53, 218, textureX, textureY); // Box 167
		bodyModel[354] = new ModelRendererTurbo(this, 79, 218, textureX, textureY); // Box 168
		bodyModel[355] = new ModelRendererTurbo(this, 61, 218, textureX, textureY); // Box 169
		bodyModel[356] = new ModelRendererTurbo(this, 61, 218, textureX, textureY); // Box 170
		bodyModel[357] = new ModelRendererTurbo(this, 71, 219, textureX, textureY); // Box 171
		bodyModel[358] = new ModelRendererTurbo(this, 71, 219, textureX, textureY); // Box 172
		bodyModel[359] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 478
		bodyModel[360] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 479
		bodyModel[361] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 480
		bodyModel[362] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 486
		bodyModel[363] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 487
		bodyModel[364] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 488
		bodyModel[365] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 404
		bodyModel[366] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 406
		bodyModel[367] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 407
		bodyModel[368] = new ModelRendererTurbo(this, 86, 218, textureX, textureY); // Box 218
		bodyModel[369] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 423
		bodyModel[370] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 424
		bodyModel[371] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 425
		bodyModel[372] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 426
		bodyModel[373] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 435
		bodyModel[374] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 436
		bodyModel[375] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 437
		bodyModel[376] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 438
		bodyModel[377] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 384
		bodyModel[378] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 385
		bodyModel[379] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 386
		bodyModel[380] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 387
		bodyModel[381] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 388
		bodyModel[382] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 389
		bodyModel[383] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 390
		bodyModel[384] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 391
		bodyModel[385] = new ModelRendererTurbo(this, 297, 151, textureX, textureY); // Box 392

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-30F, 4F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 52, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[1].setRotationPoint(-26F, -19F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 19, 0F,0F, 0F, -2.3F, 0F, 0F, -0.45F, 0F, 0F, -1.45F, 0F, 0F, -3.3F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -2.5F); // Box 63
		bodyModel[2].setRotationPoint(-36F, -18F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -1.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 65
		bodyModel[3].setRotationPoint(-38F, -18F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 66
		bodyModel[4].setRotationPoint(-39F, -18F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.35F, -0.7F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -0.35F, -0.7F, -2F, -0.3F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -2F); // Box 67
		bodyModel[5].setRotationPoint(-40F, -17F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 72
		bodyModel[6].setRotationPoint(-29F, -21F, 5.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 75
		bodyModel[7].setRotationPoint(-27F, -21F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
		bodyModel[8].setRotationPoint(-27F, -21F, 6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[9].setRotationPoint(-29F, -21F, -7.25F);

		bodyModel[10].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
		bodyModel[10].setRotationPoint(-5F, -14F, 9.5F);

		bodyModel[11].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 79
		bodyModel[11].setRotationPoint(5F, -14F, 9.5F);

		bodyModel[12].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 80
		bodyModel[12].setRotationPoint(2.5F, -14F, 9.5F);

		bodyModel[13].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 81
		bodyModel[13].setRotationPoint(-2.5F, -14F, 9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Sta_Light_1
		bodyModel[14].setRotationPoint(-40.5F, -1.25F, -0.88F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F); // Sta_Light_2
		bodyModel[15].setRotationPoint(-40.5F, -1.25F, -0.129999999999999F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, 0.3F, -0.125F, 0F, 0.05F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F); // Sta_Light_4
		bodyModel[16].setRotationPoint(-40.5F, -0.5F, -0.129999999999999F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F); // Sta_Light_3
		bodyModel[17].setRotationPoint(-40.5F, -0.5F, -0.88F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 52, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[18].setRotationPoint(-26F, -18F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 52, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 142
		bodyModel[19].setRotationPoint(-26F, -18F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2.5F, 0F, 0F, -1.3F, 0F, 0F, 0.55F, 0F, 0F, -0.45F, 0F, 0F, -2.3F); // Box 145
		bodyModel[20].setRotationPoint(-36F, -19F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,1F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.45F, 1F, 0F, 0.1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -0.9F); // Box 154
		bodyModel[21].setRotationPoint(-31F, -18F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.55F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -0.45F); // Box 165
		bodyModel[22].setRotationPoint(-31F, -19F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 184
		bodyModel[23].setRotationPoint(-38F, -15F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 185
		bodyModel[24].setRotationPoint(-39F, -15F, 4.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, 0.5F, -2.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2.5F, -0.5F, 0.5F, -3.5F, -0.5F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -0.5F, 0F, -3.5F); // Box 186
		bodyModel[25].setRotationPoint(-41F, 4F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, -0.4F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, -0.4F); // Box 179
		bodyModel[26].setRotationPoint(-31F, -16F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, -0.5F, 3, 20, 1, 0F,0F, 1F, -0.2F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, -0.3F, 0F, 0F, -0.2F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, -0.3F); // Box 180
		bodyModel[27].setRotationPoint(-32F, -14F, 8.75F);

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F); // Box 181
		bodyModel[28].setRotationPoint(-28.5F, -14F, 9F);

		bodyModel[29].addShapeBox(0F, 1F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.45F); // Box 182
		bodyModel[29].setRotationPoint(-32F, 5F, 6.6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[30].setRotationPoint(-39F, -16F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[31].setRotationPoint(-26F, -16F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[32].setRotationPoint(-26F, -16F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 156
		bodyModel[33].setRotationPoint(-26F, -14.5F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[34].setRotationPoint(-5F, -18F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 46, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 306
		bodyModel[35].setRotationPoint(-23F, -18F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 21, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[36].setRotationPoint(-26F, 4F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 3, 15, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[37].setRotationPoint(-5F, 4F, -8F);

		bodyModel[38].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 5
		bodyModel[38].setRotationPoint(-5F, 6F, 7.1F);

		bodyModel[39].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 6
		bodyModel[39].setRotationPoint(-5F, 4F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[40].setRotationPoint(-39.69F, -19F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 170 lamp
		bodyModel[41].setRotationPoint(-39.71F, -19F, -7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 92
		bodyModel[42].setRotationPoint(-38F, -15F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		bodyModel[43].setRotationPoint(-39F, -15F, -6.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,1F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1F, 0F, 0F); // Box 97
		bodyModel[44].setRotationPoint(-31F, -16F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[45].setRotationPoint(-33F, 5F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 1F, -1.5F, 0F, 1F, 0.1F, 0F, 1F, -0.1F, 0F, 1F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F); // Box 99
		bodyModel[46].setRotationPoint(-36F, -15F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F); // Box 100
		bodyModel[47].setRotationPoint(-38F, 6F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 103
		bodyModel[48].setRotationPoint(-38F, 6F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F, 0F, -0.2F, -1.7F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F); // Box 104
		bodyModel[49].setRotationPoint(-36F, 6F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 107
		bodyModel[50].setRotationPoint(-26F, 6F, 9.1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 9, 11, 0F,-0.8F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, -1.5F, -0.8F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1.5F); // Box 109
		bodyModel[51].setRotationPoint(-41F, -4F, -5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.2F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.2F, -0.5F, -1F, -1.2F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.2F, 0F, -1F); // Box 110
		bodyModel[52].setRotationPoint(-41F, -14F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F,-1.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -1.5F, -0.8F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, -1.5F); // Box 111
		bodyModel[53].setRotationPoint(-41F, -13F, -5.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2.1F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2.1F, 0F, 0F, 0.6F); // Box 112
		bodyModel[54].setRotationPoint(-36F, 4F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F); // Box 113
		bodyModel[55].setRotationPoint(-29F, 5F, -6.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 114
		bodyModel[56].setRotationPoint(5F, -14.5F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 115
		bodyModel[57].setRotationPoint(5F, 6F, 9.1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 52, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 117
		bodyModel[58].setRotationPoint(-26F, -15F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[59].setRotationPoint(-26F, 6F, -10.1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 21, 1, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[60].setRotationPoint(5F, 4F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 126
		bodyModel[61].setRotationPoint(36F, -15F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -1.55F, 0F, 0F, -3.3F, 0F, 0F, -2.3F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[62].setRotationPoint(31F, -18F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, -1.2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -2.3F, 0F, 0F, -1.3F, 0F, 0F, 1F); // Box 129
		bodyModel[63].setRotationPoint(31F, -19F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0.5F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 130
		bodyModel[64].setRotationPoint(36F, -18F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 131
		bodyModel[65].setRotationPoint(38F, -15F, -6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 9, 11, 0F,0F, 0.5F, 0.5F, -0.9F, 0.5F, -1F, -0.9F, 0.5F, -2F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, -0.9F, 0F, -1F, -0.9F, 0F, -2F, 0F, 0F, -0.5F); // Box 132
		bodyModel[66].setRotationPoint(39F, -4F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F,0F, 0F, 0.5F, -1.3F, 0F, -1F, -1.3F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, -0.9F, 0.5F, -1F, -0.9F, 0.5F, -2F, 0F, 0.5F, -0.5F); // Box 133
		bodyModel[67].setRotationPoint(39F, -16F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0.5F, -1F, -0.35F, -0.7F, -2F, -0.35F, -0.7F, -1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -2F, -0.3F, 0F, -1F, 0F, 0F, 0.5F); // Box 135
		bodyModel[68].setRotationPoint(39F, -17F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
		bodyModel[69].setRotationPoint(38F, -15F, 4.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -1.25F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 137
		bodyModel[70].setRotationPoint(38F, -18F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 138
		bodyModel[71].setRotationPoint(36F, -15F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, -0.6F); // Box 139
		bodyModel[72].setRotationPoint(36F, 6F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -3F, 0F, 0F, -2F); // Box 141
		bodyModel[73].setRotationPoint(39.9F, 4F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, -1.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, 0.5F, 0F, 0F, 1F); // Box 147
		bodyModel[74].setRotationPoint(26F, -18F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 148
		bodyModel[75].setRotationPoint(26F, -16F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.75F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 1F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.25F); // Box 149
		bodyModel[76].setRotationPoint(26.5F, -14F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.75F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 1F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.25F); // Box 150
		bodyModel[77].setRotationPoint(29F, -14F, 8.75F);

		bodyModel[78].addShapeBox(0F, 1F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.4F); // Box 151
		bodyModel[78].setRotationPoint(26F, 5F, 6.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, -1F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 152
		bodyModel[79].setRotationPoint(26F, -19F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F); // Box 158
		bodyModel[80].setRotationPoint(31F, -16F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 1.5F, 2F, 0F, 0.5F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2F, 0F, 0.5F, 2F, 0F, -1F, 0F, 0F, 0F); // Box 165
		bodyModel[81].setRotationPoint(26F, 4F, -7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 166
		bodyModel[82].setRotationPoint(31F, 4F, -5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, -0.3F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 167 lamp
		bodyModel[83].setRotationPoint(38.73F, -19.1F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F); // Box 168
		bodyModel[84].setRotationPoint(38.71F, -19.1F, -1.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 169
		bodyModel[85].setRotationPoint(32F, 5F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F); // Box 170
		bodyModel[86].setRotationPoint(26F, 5F, -6.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 171
		bodyModel[87].setRotationPoint(-39F, 4F, -5.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 173
		bodyModel[88].setRotationPoint(-36F, 5F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[89].setRotationPoint(32F, 5F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 2.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F, 0F, 0F, 2.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F); // Box 175
		bodyModel[90].setRotationPoint(36F, 4F, -4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.2F); // Box 176
		bodyModel[91].setRotationPoint(-37F, 4.9F, 5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[92].setRotationPoint(36F, 4.9F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[93].setRotationPoint(25F, 5F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 179
		bodyModel[94].setRotationPoint(5F, 5F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
		bodyModel[95].setRotationPoint(-6F, 5F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[96].setRotationPoint(-26F, 5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[97].setRotationPoint(-39F, -3F, -8.6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[98].setRotationPoint(-39F, -3.5F, -3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 185
		bodyModel[99].setRotationPoint(-37F, -3.5F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[100].setRotationPoint(-39F, -3F, 2.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F); // Box 190
		bodyModel[101].setRotationPoint(36F, 6F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[102].setRotationPoint(-7F, -5F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[103].setRotationPoint(-10F, 0F, -8.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 228
		bodyModel[104].setRotationPoint(-7.75F, 0.5F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[105].setRotationPoint(-6.25F, -17F, -5.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 197
		bodyModel[106].setRotationPoint(4.9F, -17F, 4.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 207
		bodyModel[107].setRotationPoint(-34.75F, 0.5F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
		bodyModel[108].setRotationPoint(-36F, 0F, -2.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[109].setRotationPoint(-33F, -4F, -2.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 211
		bodyModel[110].setRotationPoint(6.4F, -14.5F, 6F);

		bodyModel[111].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 212
		bodyModel[111].setRotationPoint(6.5F, -14.5F, -8.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 8
		bodyModel[112].setRotationPoint(-20.5F, -33.75F, -4.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 9
		bodyModel[113].setRotationPoint(-18.5F, -33.75F, -4.75F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 10
		bodyModel[114].setRotationPoint(-20.5F, -32.75F, -5F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[115].setRotationPoint(-20.5F, -32.75F, 4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
		bodyModel[116].setRotationPoint(-18.5F, -33.75F, -6.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 13
		bodyModel[117].setRotationPoint(-20.5F, -33.75F, 5.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
		bodyModel[118].setRotationPoint(-20.5F, -33.75F, -6.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[119].setRotationPoint(-21.5F, -20F, -4.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[120].setRotationPoint(-21.5F, -20F, 3.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 24
		bodyModel[121].setRotationPoint(-18.5F, -33.75F, 5.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F); // Box 124
		bodyModel[122].setRotationPoint(-28.5F, -21F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F); // Box 125
		bodyModel[123].setRotationPoint(-28.5F, -30.25F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F); // Box 127
		bodyModel[124].setRotationPoint(-28.5F, -30.25F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(-16.5F, -21F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F); // Box 129
		bodyModel[126].setRotationPoint(-17.5F, -30.25F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[127].setRotationPoint(-16.5F, -21F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F); // Box 131
		bodyModel[128].setRotationPoint(-17.5F, -30.25F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F); // Box 126
		bodyModel[129].setRotationPoint(-28.5F, -21F, 5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 449
		bodyModel[130].setRotationPoint(-21.5F, -21F, -5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 450
		bodyModel[131].setRotationPoint(-17.5F, -21F, -5F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 385
		bodyModel[132].setRotationPoint(-13.5F, 6F, -3F);

		bodyModel[133].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 386
		bodyModel[133].setRotationPoint(-21.5F, 6F, -2F);

		bodyModel[134].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 388
		bodyModel[134].setRotationPoint(-24.5F, 6F, -3F);

		bodyModel[135].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 389
		bodyModel[135].setRotationPoint(-14.65F, 5F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 391
		bodyModel[136].setRotationPoint(-12.65F, 7F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 394
		bodyModel[137].setRotationPoint(-15.85F, 6.15F, -6.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 399
		bodyModel[138].setRotationPoint(-20F, 6.5F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 400
		bodyModel[139].setRotationPoint(-19.5F, 6F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 401
		bodyModel[140].setRotationPoint(-21.7F, 8.25F, -6.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 405
		bodyModel[141].setRotationPoint(-21.3F, 6.15F, -6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 408
		bodyModel[142].setRotationPoint(-23.5F, 7F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 410
		bodyModel[143].setRotationPoint(-21.7F, 8.25F, 5.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 414
		bodyModel[144].setRotationPoint(-20F, 6.5F, 4F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 419
		bodyModel[145].setRotationPoint(-14.65F, 5F, 5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 426
		bodyModel[146].setRotationPoint(-16.5F, 6F, -4F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 427
		bodyModel[147].setRotationPoint(-25.5F, 5F, -5F);

		bodyModel[148].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 431
		bodyModel[148].setRotationPoint(-25.5F, 5F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 434
		bodyModel[149].setRotationPoint(-21.3F, 6.15F, 5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 436
		bodyModel[150].setRotationPoint(-15.85F, 6.15F, 5F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 24
		bodyModel[151].setRotationPoint(-8.5F, 8.5F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 457
		bodyModel[152].setRotationPoint(-26.5F, 8.5F, -8F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 458
		bodyModel[153].setRotationPoint(-27.5F, 8.5F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[154].setRotationPoint(-26.5F, 8.5F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[155].setRotationPoint(18F, -21F, -7.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 269
		bodyModel[156].setRotationPoint(18F, -21F, 5.25F);

		bodyModel[157].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 65
		bodyModel[157].setRotationPoint(32.5F, 6.5F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277 lamp
		bodyModel[158].setRotationPoint(39.1F, 2.1F, -5.4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278 lamp
		bodyModel[159].setRotationPoint(39.1F, 2.1F, 4.1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 279
		bodyModel[160].setRotationPoint(-40F, 4F, -5.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F); // Box 280
		bodyModel[161].setRotationPoint(-40F, 4F, 4.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F); // Box 281
		bodyModel[162].setRotationPoint(38.9F, 4F, 4.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 282
		bodyModel[163].setRotationPoint(38.9F, 4F, -5.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 283
		bodyModel[164].setRotationPoint(8.5F, 8.5F, -8F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 284
		bodyModel[165].setRotationPoint(7.5F, 8.5F, -7F);

		bodyModel[166].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 285
		bodyModel[166].setRotationPoint(9.5F, 5F, -5F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 286
		bodyModel[167].setRotationPoint(10.5F, 6F, -3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 290
		bodyModel[168].setRotationPoint(13.7F, 6.15F, -6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 291
		bodyModel[169].setRotationPoint(13.3F, 8.25F, -6.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 292
		bodyModel[170].setRotationPoint(15F, 6.5F, -5F);

		bodyModel[171].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 293
		bodyModel[171].setRotationPoint(13.5F, 6F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 294
		bodyModel[172].setRotationPoint(11.5F, 7F, -5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		bodyModel[173].setRotationPoint(15.5F, 6F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 296
		bodyModel[174].setRotationPoint(18.5F, 6F, -4F);

		bodyModel[175].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 297
		bodyModel[175].setRotationPoint(20.35F, 5F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 298
		bodyModel[176].setRotationPoint(19.15F, 6.15F, -6.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 300
		bodyModel[177].setRotationPoint(22.35F, 7F, -5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 303
		bodyModel[178].setRotationPoint(26.5F, 8.5F, -7F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 304
		bodyModel[179].setRotationPoint(21.5F, 6F, -3F);

		bodyModel[180].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 305
		bodyModel[180].setRotationPoint(20.35F, 5F, 5F);

		bodyModel[181].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 306
		bodyModel[181].setRotationPoint(15F, 6.5F, 4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 308
		bodyModel[182].setRotationPoint(13.7F, 6.15F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 311
		bodyModel[183].setRotationPoint(13.3F, 8.25F, 5.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[184].setRotationPoint(8.5F, 8.5F, 7F);

		bodyModel[185].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 314
		bodyModel[185].setRotationPoint(9.5F, 5F, 5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 316
		bodyModel[186].setRotationPoint(19.15F, 6.15F, 5F);

		bodyModel[187].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 319
		bodyModel[187].setRotationPoint(-24.5F, -14.5F, -8.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 320
		bodyModel[188].setRotationPoint(-25.6F, -14.5F, 6F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 322
		bodyModel[189].setRotationPoint(-13.75F, 0.5F, -6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[190].setRotationPoint(-13F, -5F, -8.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 324
		bodyModel[191].setRotationPoint(-16F, 0F, -8.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[192].setRotationPoint(-12.25F, -17F, -5.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 326
		bodyModel[193].setRotationPoint(-18.75F, 0.5F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[194].setRotationPoint(-18F, -5F, -8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 328
		bodyModel[195].setRotationPoint(-21F, 0F, -8.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[196].setRotationPoint(-17.25F, -17F, -5.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 330
		bodyModel[197].setRotationPoint(-22.75F, 0.5F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[198].setRotationPoint(-22F, -5F, -8.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 332
		bodyModel[199].setRotationPoint(-25F, 0F, -8.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[200].setRotationPoint(-21.25F, -17F, -5.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 334
		bodyModel[201].setRotationPoint(-22.75F, 0.5F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[202].setRotationPoint(-22F, -5F, 4.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		bodyModel[203].setRotationPoint(-25F, 0F, 4.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[204].setRotationPoint(-21.25F, -17F, 4.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 338
		bodyModel[205].setRotationPoint(-18.75F, 0.5F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 339
		bodyModel[206].setRotationPoint(-21F, 0F, 4.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[207].setRotationPoint(-18F, -5F, 4.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[208].setRotationPoint(-16F, 0F, 4.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[209].setRotationPoint(-13F, -5F, 4.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 343
		bodyModel[210].setRotationPoint(-13.75F, 0.5F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
		bodyModel[211].setRotationPoint(-10F, 0F, 4.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 345
		bodyModel[212].setRotationPoint(-7.75F, 0.5F, 5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[213].setRotationPoint(-7F, -5F, 4.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[214].setRotationPoint(-17.25F, -17F, 4.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[215].setRotationPoint(-12.25F, -17F, 4.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[216].setRotationPoint(-6.25F, -17F, 4.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[217].setRotationPoint(9.75F, -17F, 4.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[218].setRotationPoint(14.75F, -17F, 4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[219].setRotationPoint(19.75F, -17F, 4.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[220].setRotationPoint(9.75F, -17F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[221].setRotationPoint(4.75F, -17F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[222].setRotationPoint(14.75F, -17F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[223].setRotationPoint(19.75F, -17F, -6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[224].setRotationPoint(-32.5F, -6F, -2.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 100, 6, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -50F, -3F, 0F, -50F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 239
		bodyModel[225].setRotationPoint(-25F, -20F, -9.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 100, 6, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -50F, -3F, 0F, -50F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 325
		bodyModel[226].setRotationPoint(-25F, -20F, 9.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.3F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.3F, -0.5F, -1F, -1.3F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.3F, 0F, -1F); // Box 325
		bodyModel[227].setRotationPoint(-41F, -16.5F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.3F, 0F, 0.5F, -1.2F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.2F, 0F, 0.5F); // Box 326
		bodyModel[228].setRotationPoint(-41F, -15.5F, -6.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F, 0F, -13.7F, 0F, -4F, -0.2F, 0F, -4F, 0F, 0F, -4F, -13.5F, 0F, -4F, -13.7F); // Box 328 lamp
		bodyModel[229].setRotationPoint(-39.6F, -15.5F, -4.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1.3F, 0F, -2.5F, -1.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1.2F, 0F, -2.5F); // Box 333
		bodyModel[230].setRotationPoint(-41F, -15.5F, 4.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 337
		bodyModel[231].setRotationPoint(39.3F, -0.5F, -0.88F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Box 338
		bodyModel[232].setRotationPoint(39.3F, -0.5F, -0.129999999999999F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 339
		bodyModel[233].setRotationPoint(39.3F, 0.25F, -0.129999999999999F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Box 340
		bodyModel[234].setRotationPoint(39.3F, 0.25F, -0.88F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 52, 9, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 333
		bodyModel[235].setRotationPoint(-26F, -3.5F, -10.1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 335
		bodyModel[236].setRotationPoint(5F, -3F, 9.1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 336
		bodyModel[237].setRotationPoint(-26F, -3F, 9.1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 337
		bodyModel[238].setRotationPoint(31F, 6F, 5.5F);

		bodyModel[239].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 1F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F); // Box 338
		bodyModel[239].setRotationPoint(34F, -14F, 7.25F);

		bodyModel[240].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.75F, 0F, 1F, 0.25F, 0F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.5F, 0F, 0.25F); // Box 339
		bodyModel[240].setRotationPoint(31.5F, -14F, 8.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, 0.1F, 0F, 0F, -2.6F, 0F, 0F, 2.6F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, -2.6F, 0F, 0.5F, 2.6F, 0F, 0.5F, 0.1F); // Box 340
		bodyModel[241].setRotationPoint(26F, -3.5F, -10.1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, -2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 0F); // Box 341
		bodyModel[242].setRotationPoint(26F, -15F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, -2.6F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -2.8F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 342
		bodyModel[243].setRotationPoint(26F, 6F, -10.1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 343
		bodyModel[244].setRotationPoint(26F, -16F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 345
		bodyModel[245].setRotationPoint(-32F, 6F, -10.1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 1.1F); // Box 346
		bodyModel[246].setRotationPoint(-32F, -3.5F, -10.1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.9F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 1F); // Box 347
		bodyModel[247].setRotationPoint(-32F, -15F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 1F, 1.5F, 0F, 1F, -0.1F, 0F, 1F, 0.1F, 0F, 1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.5F); // Box 348
		bodyModel[248].setRotationPoint(-36F, -15F, 8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1.7F); // Box 349
		bodyModel[249].setRotationPoint(-36F, 6F, 8F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 350
		bodyModel[250].setRotationPoint(-2.75F, 0.5F, -6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[251].setRotationPoint(-5F, 0F, -8.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[252].setRotationPoint(-2F, -5F, -8.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 353
		bodyModel[253].setRotationPoint(3.25F, 0.5F, -6F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 354
		bodyModel[254].setRotationPoint(1F, 0F, -8.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[255].setRotationPoint(4F, -5F, -8.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 356
		bodyModel[256].setRotationPoint(8.25F, 0.5F, -6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[257].setRotationPoint(9F, -5F, -8.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 358
		bodyModel[258].setRotationPoint(6F, 0F, -8.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 359
		bodyModel[259].setRotationPoint(13.25F, 0.5F, -6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[260].setRotationPoint(14F, -5F, -8.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[261].setRotationPoint(11F, 0F, -8.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 362
		bodyModel[262].setRotationPoint(18.25F, 0.5F, -6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[263].setRotationPoint(19F, -5F, -8.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 364
		bodyModel[264].setRotationPoint(16F, 0F, -8.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 365
		bodyModel[265].setRotationPoint(24.25F, 0.5F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[266].setRotationPoint(25F, -5F, -8.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 367
		bodyModel[267].setRotationPoint(22F, 0F, -8.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[268].setRotationPoint(25.75F, -17F, -6F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[269].setRotationPoint(19F, -5F, 4.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 370
		bodyModel[270].setRotationPoint(22F, 0F, 4.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[271].setRotationPoint(25F, -5F, 4.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[272].setRotationPoint(16F, 0F, 4.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 373
		bodyModel[273].setRotationPoint(11F, 0F, 4.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[274].setRotationPoint(14F, -5F, 4.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[275].setRotationPoint(9F, -5F, 4.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376
		bodyModel[276].setRotationPoint(6F, 0F, 4.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 377
		bodyModel[277].setRotationPoint(8.25F, 0.5F, 5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 378
		bodyModel[278].setRotationPoint(13.25F, 0.5F, 5F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 379
		bodyModel[279].setRotationPoint(18.25F, 0.5F, 5F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 380
		bodyModel[280].setRotationPoint(24.25F, 0.5F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F); // Box 381 lamp
		bodyModel[281].setRotationPoint(-40.5F, 1.75F, -0.88F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F); // Box 382 lamp
		bodyModel[282].setRotationPoint(-40.5F, 1.75F, -0.129999999999999F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F); // Box 383 lamp
		bodyModel[283].setRotationPoint(-40.5F, 1F, -0.129999999999999F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 384 lamp
		bodyModel[284].setRotationPoint(-40.5F, 1F, -0.88F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F); // Box 385 lamp
		bodyModel[285].setRotationPoint(-40.5F, 0.5F, 0.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F); // Box 386 lamp
		bodyModel[286].setRotationPoint(-40.5F, 0.5F, 1.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F); // Box 387 lamp
		bodyModel[287].setRotationPoint(-40.5F, -0.25F, 1.25F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 388 lamp
		bodyModel[288].setRotationPoint(-40.5F, -0.25F, 0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F); // Box 389 lamp
		bodyModel[289].setRotationPoint(-40.5F, 0.5F, -2.25F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, 0.3F, -0.125F, 0F, 0.05F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F); // Box 390 lamp
		bodyModel[290].setRotationPoint(-40.5F, 0.5F, -1.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F); // Box 391 lamp
		bodyModel[291].setRotationPoint(-40.5F, -0.25F, -1.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, 0F, -0.125F, 0.3F, 0F, -0.125F, 0.3F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 392 lamp
		bodyModel[292].setRotationPoint(-40.5F, -0.25F, -2.25F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[293].setRotationPoint(39.1F, 1.2F, 4.1F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[294].setRotationPoint(39.1F, 1.2F, -5.4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 56, 1, 5, 0F,1F, -1F, 0F, 1F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[295].setRotationPoint(-31F, -20F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 61, 1, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 378
		bodyModel[296].setRotationPoint(-31F, -20F, 3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 61, 1, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[297].setRotationPoint(-31F, -20F, -3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 380
		bodyModel[298].setRotationPoint(-36F, -20F, -3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.5F, 0F, 0F, -0.4F, 0F, -1F, -1F, 0F, 0F, -1.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 381
		bodyModel[299].setRotationPoint(-36F, -20F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, -0.4F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 382
		bodyModel[300].setRotationPoint(-36F, -20F, -8F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-1F, -1F, -0.2F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -0.4F, 0F, -1F, 0F, -0.2F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[301].setRotationPoint(30F, -20F, -8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[302].setRotationPoint(30F, -20F, -3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, -0.4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, -1F, 0F, 0F); // Box 306
		bodyModel[303].setRotationPoint(30F, -20F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1F, -1F, 0F, 1F, -1F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 307
		bodyModel[304].setRotationPoint(25F, -20F, -8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.4F, 0F, -0.6F, -0.6F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.75F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[305].setRotationPoint(39F, 0.8F, 3.8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.2F); // Box 31
		bodyModel[306].setRotationPoint(39F, 0.8F, 4.8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.2F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.4F); // Box 32
		bodyModel[307].setRotationPoint(39F, 2.8F, 4.8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.4F, 0F, -0.6F, -0.6F, 0F, -0.5F, 0F, 0F, -0.3F, 0F); // Box 33
		bodyModel[308].setRotationPoint(39F, 2.8F, 3.8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.2F); // Box 331
		bodyModel[309].setRotationPoint(39F, 1.8F, 4.8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[310].setRotationPoint(39F, 1.8F, 3.8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, -0.2F); // Box 336
		bodyModel[311].setRotationPoint(38.9F, 0.8F, -4.8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, -0.2F); // Box 337
		bodyModel[312].setRotationPoint(38.9F, 1.8F, -4.8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.75F, 0F, -0.2F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.6F, -0.5F, -0.5F, -0.4F); // Box 338
		bodyModel[313].setRotationPoint(38.9F, 2.8F, -4.8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.6F, -0.6F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0.35F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[314].setRotationPoint(38.9F, 0.8F, -5.8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[315].setRotationPoint(38.9F, 1.8F, -5.8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.6F, -0.6F, 0F, -0.5F, 0F, 0F, -0.3F, 0F); // Box 346
		bodyModel[316].setRotationPoint(38.9F, 2.8F, -5.8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 336
		bodyModel[317].setRotationPoint(-41.5F, -15F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[318].setRotationPoint(-40.6F, -10F, 8.8F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 1.2F, 0.5F, 0.5F, -1F, 0.2F, 0.5F, 1F, -0.5F, 0F, 0.25F, 0.5F, 0F, 1.2F, 0.5F, 0F, -1F, 0.2F, 0F, 1F); // Box 367
		bodyModel[319].setRotationPoint(-39.5F, 4F, -5.51F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 1.5F); // Box 368
		bodyModel[320].setRotationPoint(-38F, 4F, -8.03F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 1.5F); // Box 369
		bodyModel[321].setRotationPoint(-36F, 4F, -9.01F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 376
		bodyModel[322].setRotationPoint(-26.01F, 4F, 9.22F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 313
		bodyModel[323].setRotationPoint(-26.01F, 4F, -10.21F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.75F, 1.5F, 0.01F, -0.75F, 0.5F, 0.01F, -0.75F, -0.5F, 0F, -0.75F, -1.5F); // Box 315
		bodyModel[324].setRotationPoint(-38F, 4F, 7.01F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1.95F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.75F, -1.95F, 0F, -0.75F, -0.3F, 0F, -0.75F, 0F, 0F, -0.75F, 2F); // Box 615
		bodyModel[325].setRotationPoint(-36F, -16.1F, -9.51F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.2F, 0F, -0.75F, 0.7F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 617
		bodyModel[326].setRotationPoint(-32F, -16.1F, -9.41F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 618
		bodyModel[327].setRotationPoint(-26F, -16.1F, -10.11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0.5F, 0F, 1.1F, 0.5F, 0F, -1F, 0.3F, 0F, 0.5F, -0.4F, -0.75F, 0F, 0.5F, -0.75F, 1.1F, 0.5F, -0.75F, -1F, 0.3F, -0.75F, 0.5F); // Box 414
		bodyModel[328].setRotationPoint(-39.5F, -16.1F, -5.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.1F, 0F, 0.45F, -0.6F, 0F, 1.05F, -0.6F, 0F, 1.05F, -0.1F, 0F, 0.45F, -0.1F, -0.75F, 0.45F, -0.6F, -0.75F, 1.05F, -0.6F, -0.75F, 1.05F, -0.1F, -0.75F, 0.45F); // Box 417
		bodyModel[329].setRotationPoint(-39.9F, -16.1F, -3.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.9F, 0F, 0F, -0.95F, 0F, 0F, 0.3F, 0F, 0F, 1.75F, 0F, -0.75F, -1.9F, 0F, -0.75F, -0.95F, 0F, -0.75F, 0.3F, 0F, -0.75F, 1.75F); // Box 411
		bodyModel[330].setRotationPoint(-38F, -16.1F, -8.51F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 1.1F, -0.4F, 0F, 0F, 0.3F, -0.75F, 0.5F, 0.5F, -0.75F, -1F, 0.5F, -0.75F, 1.1F, -0.4F, -0.75F, 0F); // Box 366
		bodyModel[331].setRotationPoint(-39.5F, -16.1F, 4.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1.75F, 0F, 0F, 0.3F, 0F, 0F, -0.95F, 0F, 0F, -1.9F, 0F, -0.75F, 1.75F, 0F, -0.75F, 0.3F, 0F, -0.75F, -0.95F, 0F, -0.75F, -1.9F); // Box 367
		bodyModel[332].setRotationPoint(-38F, -16.1F, 7.49F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1.95F, 0F, -0.75F, 2F, 0F, -0.75F, 0F, 0F, -0.75F, -0.3F, 0F, -0.75F, -1.95F); // Box 340
		bodyModel[333].setRotationPoint(-36F, -16.1F, 8.49F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, -0.2F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.7F, 0F, -0.75F, -0.2F); // Box 341
		bodyModel[334].setRotationPoint(-32F, -16.1F, 8.39F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 342
		bodyModel[335].setRotationPoint(4.99F, 4F, 9.22F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -0.4F, 0F, -0.75F, 0F, 0F, -0.75F, 1.5F); // Box 343
		bodyModel[336].setRotationPoint(-32F, 4F, -10.61F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -1.5F, 0F, -0.75F, 1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, -1.5F); // Box 344
		bodyModel[337].setRotationPoint(-36F, 4F, 8.01F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, -1.2F, 0F, 0F, 0.6F, 0F, 0F, -1.5F, 0F, -0.75F, 1.5F, 0F, -0.75F, -1.2F, 0F, -0.75F, 0.6F, 0F, -0.75F, -1.5F); // Box 345
		bodyModel[338].setRotationPoint(26F, 4F, -8.71F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -0.75F, -1.5F, 0.01F, -0.75F, -0.5F, 0.01F, -0.75F, 0.5F, 0F, -0.75F, 1.5F); // Box 346
		bodyModel[339].setRotationPoint(36F, 4F, 5.01F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.6F, 0.2F, 0F, 1F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 1F, 0.5F, -0.75F, -0.7F, 0.2F, -0.75F, 1F); // Box 347
		bodyModel[340].setRotationPoint(38.2F, 4F, 4.51F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 1F, 0.5F, 0F, -0.6F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.2F, -0.75F, 1F, 0.5F, -0.75F, -0.7F, 0.5F, -0.75F, 1F, -0.5F, -0.75F, 0F); // Box 348
		bodyModel[341].setRotationPoint(38.2F, 4F, -5.51F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.75F, 1.5F, 0.01F, -0.75F, 0.5F, 0.01F, -0.75F, -0.5F, 0F, -0.75F, -1.5F); // Box 349
		bodyModel[342].setRotationPoint(36F, 4F, -6.01F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 1.1F, -0.4F, 0F, 0F, 0.4F, 0F, 0.6F, 0.5F, 0F, -0.9F, 0.5F, -0.75F, 1.1F, -0.4F, -0.75F, 0F, 0.4F, -0.75F, 0.6F, 0.5F, -0.75F, -1F); // Box 348
		bodyModel[343].setRotationPoint(38.5F, -16.1F, -5.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.6F, 0F, 0.95F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0.45F, -0.6F, 0F, 0.95F, -0.6F, -0.75F, 0.95F, -0.1F, -0.75F, 0.45F, -0.1F, -0.75F, 0.45F, -0.6F, -0.75F, 0.95F); // Box 349
		bodyModel[344].setRotationPoint(39F, -16.1F, -3.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.95F, 0F, 0F, -1.9F, 0F, 0F, 1.75F, 0F, 0F, 0.3F, 0F, -0.75F, -0.95F, 0F, -0.75F, -1.9F, 0F, -0.75F, 1.75F, 0F, -0.75F, 0.3F); // Box 350
		bodyModel[345].setRotationPoint(36F, -16.1F, -8.51F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -1F, 0.4F, 0F, 0.6F, -0.4F, 0F, 0F, 0.5F, 0F, 1.1F, 0.5F, -0.75F, -1F, 0.4F, -0.75F, 0.6F, -0.4F, -0.75F, 0F, 0.5F, -0.75F, 1.1F); // Box 351
		bodyModel[346].setRotationPoint(38.5F, -16.1F, 4.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 1.75F, 0F, 0F, -1.9F, 0F, 0F, -0.95F, 0F, -0.75F, 0.3F, 0F, -0.75F, 1.75F, 0F, -0.75F, -1.9F, 0F, -0.75F, -0.95F); // Box 352
		bodyModel[347].setRotationPoint(36F, -16.1F, 7.49F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.7F, 0F, 0F, -1.8F, 0F, 0F, 1.1F, 0F, 0F, -1F, 0F, -0.75F, 0.7F, 0F, -0.75F, -1.8F, 0F, -0.75F, 1.1F, 0F, -0.75F, -1F); // Box 353
		bodyModel[348].setRotationPoint(26F, -16.1F, -9.41F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 356
		bodyModel[349].setRotationPoint(-26F, -16.1F, 9.11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1.95F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 2.1F, 0F, -0.75F, -2.05F, 0F, -0.75F, -0.35F, 0F, -0.75F, 0F, 0F, -0.75F, 2.1F); // Box 357
		bodyModel[350].setRotationPoint(31F, -16.1F, 6.55F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.24F, 0F, 0F, 0.7F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.24F, 0F, -0.75F, 0.7F); // Box 358
		bodyModel[351].setRotationPoint(26F, -16.1F, 8.41F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[352].setRotationPoint(41.4F, 4.7F, -2F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 167
		bodyModel[353].setRotationPoint(41.5F, 5.25F, -3F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 168
		bodyModel[354].setRotationPoint(41.5F, 5.25F, 2F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 169
		bodyModel[355].setRotationPoint(41.7F, 5.5F, 0F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 170
		bodyModel[356].setRotationPoint(41.7F, 6.25F, -2F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 171
		bodyModel[357].setRotationPoint(42F, 5.25F, -2F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 172
		bodyModel[358].setRotationPoint(42.5F, 7.25F, 0F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 478
		bodyModel[359].setRotationPoint(36F, 9F, -3.4F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 1F, 0F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, -0.5F, 1F, 0F, -0.5F); // Box 479
		bodyModel[360].setRotationPoint(40F, 8F, -2.4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, -2F, 0.5F, 0.5F); // Box 480
		bodyModel[361].setRotationPoint(34F, 8F, -3.9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 1F, -0.5F, 0F); // Box 486
		bodyModel[362].setRotationPoint(37F, 9F, 2.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, -2F, 0.5F, -0.5F); // Box 487
		bodyModel[363].setRotationPoint(34F, 8F, 3F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 1F, 0F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0.5F, 0.5F, 1F, 0F, 0.5F); // Box 488
		bodyModel[364].setRotationPoint(40F, 8F, 1.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,1.5F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 404
		bodyModel[365].setRotationPoint(34F, 6.5F, -3.9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F); // Box 406
		bodyModel[366].setRotationPoint(40.5F, 6.5F, -2.4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F); // Box 407
		bodyModel[367].setRotationPoint(40.5F, 6.5F, 1.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,1.5F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 218
		bodyModel[368].setRotationPoint(34F, 6.5F, 3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[369].setRotationPoint(-24F, 7.5F, -8F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[370].setRotationPoint(-15F, 7.5F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[371].setRotationPoint(-14F, 5.5F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 426
		bodyModel[372].setRotationPoint(-22F, 5.5F, -8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[373].setRotationPoint(-15F, 7.5F, 6.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[374].setRotationPoint(-24F, 7.5F, 6.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 437
		bodyModel[375].setRotationPoint(-22F, 5.5F, 6.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[376].setRotationPoint(-14F, 5.5F, 6.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[377].setRotationPoint(11F, 7.5F, -8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[378].setRotationPoint(20F, 7.5F, -8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[379].setRotationPoint(21F, 5.5F, -8F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387
		bodyModel[380].setRotationPoint(13F, 5.5F, -8F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[381].setRotationPoint(20F, 7.5F, 6.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[382].setRotationPoint(11F, 7.5F, 6.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 390
		bodyModel[383].setRotationPoint(13F, 5.5F, 6.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[384].setRotationPoint(21F, 5.5F, 6.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.5F, 1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 1.2F, -0.5F, 0.5F, 0.25F, 0.2F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 1.2F, -0.5F, 0F, 0.25F); // Box 392
		bodyModel[385].setRotationPoint(-39.5F, 4F, 4.49F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < 386; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp") && entity instanceof Locomotive && ((Locomotive)entity).isLocoTurnedOn() && ((Locomotive)entity).getIsFuelled()) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
}