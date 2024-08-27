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

public class ModelDuewagGT6ERTail extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDuewagGT6ERTail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[222];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 65
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 66
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 67
		bodyModel[5] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 140
		bodyModel[6] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 142
		bodyModel[7] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 186
		bodyModel[8] = new ModelRendererTurbo(this, 57, 28, textureX, textureY); // Box 139
		bodyModel[9] = new ModelRendererTurbo(this, 233, 27, textureX, textureY); // Box 141
		bodyModel[10] = new ModelRendererTurbo(this, 271, 138, textureX, textureY); // Box 156
		bodyModel[11] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 306
		bodyModel[12] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 6
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 294
		bodyModel[16] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 170 lamp
		bodyModel[17] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 98
		bodyModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[19] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 106
		bodyModel[20] = new ModelRendererTurbo(this, 66, 197, textureX, textureY); // Box 107
		bodyModel[21] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 112
		bodyModel[22] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 113
		bodyModel[23] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 116
		bodyModel[24] = new ModelRendererTurbo(this, 390, 126, textureX, textureY); // Box 117
		bodyModel[25] = new ModelRendererTurbo(this, 100, 81, textureX, textureY); // Box 118
		bodyModel[26] = new ModelRendererTurbo(this, 8, 111, textureX, textureY); // Box 120
		bodyModel[27] = new ModelRendererTurbo(this, 16, 111, textureX, textureY); // Box 121
		bodyModel[28] = new ModelRendererTurbo(this, 24, 111, textureX, textureY); // Box 122
		bodyModel[29] = new ModelRendererTurbo(this, 32, 111, textureX, textureY); // Box 123
		bodyModel[30] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 171
		bodyModel[31] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 173
		bodyModel[32] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 176
		bodyModel[33] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 179
		bodyModel[34] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 180
		bodyModel[35] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 181
		bodyModel[36] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 226
		bodyModel[37] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 227
		bodyModel[38] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 228
		bodyModel[39] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 195
		bodyModel[40] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 196
		bodyModel[41] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 385
		bodyModel[42] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 386
		bodyModel[43] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 388
		bodyModel[44] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 389
		bodyModel[45] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 390
		bodyModel[46] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 391
		bodyModel[47] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 392
		bodyModel[48] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 394
		bodyModel[49] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 399
		bodyModel[50] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 400
		bodyModel[51] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 405
		bodyModel[52] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 407
		bodyModel[53] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 408
		bodyModel[54] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 409
		bodyModel[55] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 414
		bodyModel[56] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 419
		bodyModel[57] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 421
		bodyModel[58] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 422
		bodyModel[59] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 426
		bodyModel[60] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 427
		bodyModel[61] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 431
		bodyModel[62] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 432
		bodyModel[63] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 434
		bodyModel[64] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 435
		bodyModel[65] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 436
		bodyModel[66] = new ModelRendererTurbo(this, 91, 107, textureX, textureY); // Box 24
		bodyModel[67] = new ModelRendererTurbo(this, 179, 107, textureX, textureY); // Box 458
		bodyModel[68] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 64
		bodyModel[69] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 237
		bodyModel[70] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 275 lamp
		bodyModel[71] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 276 lamp
		bodyModel[72] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 279
		bodyModel[73] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 280
		bodyModel[74] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 318
		bodyModel[75] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 319
		bodyModel[76] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 320
		bodyModel[77] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 322
		bodyModel[78] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 323
		bodyModel[79] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 324
		bodyModel[80] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 325
		bodyModel[81] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 326
		bodyModel[82] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 327
		bodyModel[83] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 328
		bodyModel[84] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 329
		bodyModel[85] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 330
		bodyModel[86] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 331
		bodyModel[87] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 332
		bodyModel[88] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 333
		bodyModel[89] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 334
		bodyModel[90] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 335
		bodyModel[91] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 336
		bodyModel[92] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 337
		bodyModel[93] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 338
		bodyModel[94] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 339
		bodyModel[95] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 340
		bodyModel[96] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 341
		bodyModel[97] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 342
		bodyModel[98] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 343
		bodyModel[99] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 344
		bodyModel[100] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 345
		bodyModel[101] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 346
		bodyModel[102] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 347
		bodyModel[103] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 348
		bodyModel[104] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 349
		bodyModel[105] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 376
		bodyModel[106] = new ModelRendererTurbo(this, 389, 141, textureX, textureY); // Box 333
		bodyModel[107] = new ModelRendererTurbo(this, 271, 152, textureX, textureY); // Box 336
		bodyModel[108] = new ModelRendererTurbo(this, 198, 65, textureX, textureY); // Box 361
		bodyModel[109] = new ModelRendererTurbo(this, 198, 78, textureX, textureY); // Box 362
		bodyModel[110] = new ModelRendererTurbo(this, 198, 52, textureX, textureY); // Box 363
		bodyModel[111] = new ModelRendererTurbo(this, 6, 54, textureX, textureY); // Box 367
		bodyModel[112] = new ModelRendererTurbo(this, 414, 65, textureX, textureY); // Box 61
		bodyModel[113] = new ModelRendererTurbo(this, 389, 65, textureX, textureY); // Box 88
		bodyModel[114] = new ModelRendererTurbo(this, 389, 58, textureX, textureY); // Box 172
		bodyModel[115] = new ModelRendererTurbo(this, 396, 58, textureX, textureY); // Box 176
		bodyModel[116] = new ModelRendererTurbo(this, 405, 58, textureX, textureY); // Box 404
		bodyModel[117] = new ModelRendererTurbo(this, 414, 58, textureX, textureY); // Box 405
		bodyModel[118] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 406
		bodyModel[119] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 407
		bodyModel[120] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 408
		bodyModel[121] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 409
		bodyModel[122] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 410
		bodyModel[123] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 411
		bodyModel[124] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 412
		bodyModel[125] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 413
		bodyModel[126] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 414
		bodyModel[127] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 415
		bodyModel[128] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 416
		bodyModel[129] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 417
		bodyModel[130] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 418
		bodyModel[131] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 419
		bodyModel[132] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 420
		bodyModel[133] = new ModelRendererTurbo(this, 329, 184, textureX, textureY); // Box 131
		bodyModel[134] = new ModelRendererTurbo(this, 338, 208, textureX, textureY); // Box 132
		bodyModel[135] = new ModelRendererTurbo(this, 338, 186, textureX, textureY); // Box 133
		bodyModel[136] = new ModelRendererTurbo(this, 377, 184, textureX, textureY); // Box 138
		bodyModel[137] = new ModelRendererTurbo(this, 244, 166, textureX, textureY); // Box 147
		bodyModel[138] = new ModelRendererTurbo(this, 282, 178, textureX, textureY); // Box 148
		bodyModel[139] = new ModelRendererTurbo(this, 218, 198, textureX, textureY); // Box 149
		bodyModel[140] = new ModelRendererTurbo(this, 227, 198, textureX, textureY); // Box 150
		bodyModel[141] = new ModelRendererTurbo(this, 382, 176, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 190
		bodyModel[143] = new ModelRendererTurbo(this, 505, 23, textureX, textureY); // Box 323
		bodyModel[144] = new ModelRendererTurbo(this, 449, 23, textureX, textureY); // Box 324
		bodyModel[145] = new ModelRendererTurbo(this, 201, 198, textureX, textureY); // Box 190
		bodyModel[146] = new ModelRendererTurbo(this, 209, 198, textureX, textureY); // Box 191
		bodyModel[147] = new ModelRendererTurbo(this, 386, 183, textureX, textureY); // Box 192
		bodyModel[148] = new ModelRendererTurbo(this, 210, 223, textureX, textureY); // Box 193
		bodyModel[149] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 194
		bodyModel[150] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 195
		bodyModel[151] = new ModelRendererTurbo(this, 409, 156, textureX, textureY); // Box 196
		bodyModel[152] = new ModelRendererTurbo(this, 409, 160, textureX, textureY); // Box 197
		bodyModel[153] = new ModelRendererTurbo(this, 409, 173, textureX, textureY); // Box 198
		bodyModel[154] = new ModelRendererTurbo(this, 377, 197, textureX, textureY); // Box 199
		bodyModel[155] = new ModelRendererTurbo(this, 319, 197, textureX, textureY); // Box 200
		bodyModel[156] = new ModelRendererTurbo(this, 319, 184, textureX, textureY); // Box 201
		bodyModel[157] = new ModelRendererTurbo(this, 99, 201, textureX, textureY); // Box 202
		bodyModel[158] = new ModelRendererTurbo(this, 13, 155, textureX, textureY); // Box 203
		bodyModel[159] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 204
		bodyModel[160] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 205
		bodyModel[161] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 206
		bodyModel[162] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 207
		bodyModel[163] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 208
		bodyModel[164] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 209
		bodyModel[165] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 210
		bodyModel[166] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 211
		bodyModel[167] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 212
		bodyModel[168] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 213
		bodyModel[169] = new ModelRendererTurbo(this, 283, 121, textureX, textureY); // Box 367
		bodyModel[170] = new ModelRendererTurbo(this, 318, 121, textureX, textureY); // Box 369
		bodyModel[171] = new ModelRendererTurbo(this, 315, 121, textureX, textureY); // Box 371
		bodyModel[172] = new ModelRendererTurbo(this, 315, 121, textureX, textureY); // Box 376
		bodyModel[173] = new ModelRendererTurbo(this, 315, 121, textureX, textureY); // Box 377
		bodyModel[174] = new ModelRendererTurbo(this, 283, 121, textureX, textureY); // Box 186
		bodyModel[175] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 377
		bodyModel[176] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 378
		bodyModel[177] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 379
		bodyModel[178] = new ModelRendererTurbo(this, 19, 198, textureX, textureY); // Box 380
		bodyModel[179] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 381
		bodyModel[180] = new ModelRendererTurbo(this, 2, 196, textureX, textureY); // Box 382
		bodyModel[181] = new ModelRendererTurbo(this, 270, 163, textureX, textureY); // Box 618
		bodyModel[182] = new ModelRendererTurbo(this, 311, 166, textureX, textureY); // Box 619
		bodyModel[183] = new ModelRendererTurbo(this, 361, 152, textureX, textureY); // Box 620
		bodyModel[184] = new ModelRendererTurbo(this, 285, 166, textureX, textureY); // Box 415
		bodyModel[185] = new ModelRendererTurbo(this, 363, 139, textureX, textureY); // Box 417
		bodyModel[186] = new ModelRendererTurbo(this, 316, 166, textureX, textureY); // Box 218
		bodyModel[187] = new ModelRendererTurbo(this, 351, 166, textureX, textureY); // Box 219
		bodyModel[188] = new ModelRendererTurbo(this, 344, 166, textureX, textureY); // Box 220
		bodyModel[189] = new ModelRendererTurbo(this, 321, 166, textureX, textureY); // Box 221
		bodyModel[190] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 30
		bodyModel[191] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 31
		bodyModel[192] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 32
		bodyModel[193] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 33
		bodyModel[194] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 331
		bodyModel[195] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 332
		bodyModel[196] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 336
		bodyModel[197] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 337
		bodyModel[198] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 338
		bodyModel[199] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 344
		bodyModel[200] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 345
		bodyModel[201] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 346
		bodyModel[202] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 393
		bodyModel[203] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 401
		bodyModel[204] = new ModelRendererTurbo(this, 419, 57, textureX, textureY); // Box 406
		bodyModel[205] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 410
		bodyModel[206] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 420
		bodyModel[207] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 433
		bodyModel[208] = new ModelRendererTurbo(this, 137, 247, textureX, textureY); // Box 239
		bodyModel[209] = new ModelRendererTurbo(this, 321, 247, textureX, textureY); // Box 325
		bodyModel[210] = new ModelRendererTurbo(this, 177, 85, textureX, textureY); // Box 24
		bodyModel[211] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 457
		bodyModel[212] = new ModelRendererTurbo(this, 177, 85, textureX, textureY); // Box 458
		bodyModel[213] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 461
		bodyModel[214] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 423
		bodyModel[215] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 424
		bodyModel[216] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 425
		bodyModel[217] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 426
		bodyModel[218] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 435
		bodyModel[219] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 436
		bodyModel[220] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 437
		bodyModel[221] = new ModelRendererTurbo(this, 267, 108, textureX, textureY); // Box 438

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, -0.25F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, -0.25F); // Box 9
		bodyModel[0].setRotationPoint(-17.5F, 4F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 43, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[1].setRotationPoint(-13.5F, -19F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -0.25F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 65
		bodyModel[2].setRotationPoint(-25.5F, -18F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -0.5F, -0.3F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, -0.5F, -1.3F, 0F, 0F, 0.8F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F); // Box 66
		bodyModel[3].setRotationPoint(-26.5F, -18F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.35F, -0.7F, -0.25F, 0F, 0.5F, 0.7F, 0F, 0.5F, -0.3F, -0.35F, -0.7F, -1.25F, -0.3F, 0F, -0.25F, 0F, 0F, 1.8F, 0F, 0F, 0.7F, -0.3F, 0F, -1.25F); // Box 67
		bodyModel[4].setRotationPoint(-27.5F, -17F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[5].setRotationPoint(-13.5F, -18F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 43, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 142
		bodyModel[6].setRotationPoint(-13.5F, -18F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, -0.5F, 0F, -2.3F, -0.5F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, -0.5F, 0F, -2.3F); // Box 186
		bodyModel[7].setRotationPoint(-28.5F, 4F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[8].setRotationPoint(-13.5F, -16F, 9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[9].setRotationPoint(-13.5F, -16F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 43, 11, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 156
		bodyModel[10].setRotationPoint(-13.5F, -14.5F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 37, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 306
		bodyModel[11].setRotationPoint(-10.5F, -18F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[12].setRotationPoint(-13.5F, 4F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[13].setRotationPoint(7.5F, 4F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 6
		bodyModel[14].setRotationPoint(7.5F, 4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[15].setRotationPoint(-27.19F, -19F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 170 lamp
		bodyModel[16].setRotationPoint(-27.2F, -19.01F, -7.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 98
		bodyModel[17].setRotationPoint(-20.5F, 5F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.55F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 103
		bodyModel[18].setRotationPoint(-25.5F, 6F, -8F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 106
		bodyModel[19].setRotationPoint(7.5F, 6F, -10.1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 107
		bodyModel[20].setRotationPoint(-13.5F, 6F, 9.1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.75F, 0F, 0F, 1F); // Box 112
		bodyModel[21].setRotationPoint(-23.5F, 4F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F); // Box 113
		bodyModel[22].setRotationPoint(-16.5F, 5F, -6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
		bodyModel[23].setRotationPoint(7.5F, -18F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 117
		bodyModel[24].setRotationPoint(-13.5F, -15F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[25].setRotationPoint(-13.5F, 6F, -10.1F);

		bodyModel[26].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 120
		bodyModel[26].setRotationPoint(17.5F, -14F, -9.5F);

		bodyModel[27].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 121
		bodyModel[27].setRotationPoint(15F, -14F, -9.5F);

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 122
		bodyModel[28].setRotationPoint(7.5F, -14F, -9.5F);

		bodyModel[29].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 123
		bodyModel[29].setRotationPoint(10F, -14F, -9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 171
		bodyModel[30].setRotationPoint(-26.5F, 4F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 173
		bodyModel[31].setRotationPoint(-23.5F, 5F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.2F); // Box 176
		bodyModel[32].setRotationPoint(-24.5F, 4.9F, 6.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 179
		bodyModel[33].setRotationPoint(17.5F, 5F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
		bodyModel[34].setRotationPoint(6.5F, 5F, -8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[35].setRotationPoint(-14.5F, 5F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[36].setRotationPoint(2F, -5F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[37].setRotationPoint(2.5F, 0F, -8.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 228
		bodyModel[38].setRotationPoint(4.75F, 0.5F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[39].setRotationPoint(2.25F, -18F, -5.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 196
		bodyModel[40].setRotationPoint(17.6F, -17F, -8.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 385
		bodyModel[41].setRotationPoint(-2F, 6F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 386
		bodyModel[42].setRotationPoint(-10F, 6F, -2F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 388
		bodyModel[43].setRotationPoint(-13F, 6F, -3F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 389
		bodyModel[44].setRotationPoint(-3.15F, 5F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 390
		bodyModel[45].setRotationPoint(-1.65F, 6.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 391
		bodyModel[46].setRotationPoint(-1.15F, 7F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 392
		bodyModel[47].setRotationPoint(0.05F, 6.15F, -6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 394
		bodyModel[48].setRotationPoint(-3.35F, 6.15F, -6.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 399
		bodyModel[49].setRotationPoint(-8.5F, 6.5F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 400
		bodyModel[50].setRotationPoint(-8F, 6F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 405
		bodyModel[51].setRotationPoint(-10.8F, 6.15F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 407
		bodyModel[52].setRotationPoint(-12.5F, 6.5F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 408
		bodyModel[53].setRotationPoint(-12F, 7F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 409
		bodyModel[54].setRotationPoint(-14.2F, 6.15F, -6.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 414
		bodyModel[55].setRotationPoint(-8.5F, 6.5F, 4F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 419
		bodyModel[56].setRotationPoint(-3.15F, 5F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 421
		bodyModel[57].setRotationPoint(-1.65F, 6.5F, 4.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 422
		bodyModel[58].setRotationPoint(0.05F, 6.15F, 5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 426
		bodyModel[59].setRotationPoint(-5F, 6F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 427
		bodyModel[60].setRotationPoint(-14F, 5F, -5F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 431
		bodyModel[61].setRotationPoint(-14F, 5F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 432
		bodyModel[62].setRotationPoint(-12.5F, 6.5F, 4.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 434
		bodyModel[63].setRotationPoint(-10.8F, 6.15F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 435
		bodyModel[64].setRotationPoint(-14.2F, 6.15F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 436
		bodyModel[65].setRotationPoint(-3.35F, 6.15F, 5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 24
		bodyModel[66].setRotationPoint(2F, 8.25F, -6F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 458
		bodyModel[67].setRotationPoint(-15F, 8.25F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 64
		bodyModel[68].setRotationPoint(-28F, 6.5F, -0.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 237
		bodyModel[69].setRotationPoint(-29F, 6F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275 lamp
		bodyModel[70].setRotationPoint(-27.4F, 0.300000000000001F, 5.35F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 276 lamp
		bodyModel[71].setRotationPoint(-27.4F, 0.300000000000001F, -6.6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 279
		bodyModel[72].setRotationPoint(-27.5F, 4F, -6.2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.5F); // Box 280
		bodyModel[73].setRotationPoint(-27.5F, 4F, 5.2F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 318
		bodyModel[74].setRotationPoint(-13.4F, -17F, -8.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 319
		bodyModel[75].setRotationPoint(-12F, -14.5F, -8.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 320
		bodyModel[76].setRotationPoint(-13.1F, -14.5F, 6F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 322
		bodyModel[77].setRotationPoint(-1.25F, 0.5F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[78].setRotationPoint(-4F, -5F, -8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 324
		bodyModel[79].setRotationPoint(-3.5F, 0F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[80].setRotationPoint(-3.75F, -18F, -5.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 326
		bodyModel[81].setRotationPoint(-6.25F, 0.5F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 327
		bodyModel[82].setRotationPoint(-9F, -5F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 328
		bodyModel[83].setRotationPoint(-8.5F, 0F, -8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[84].setRotationPoint(-8.75F, -18F, -5.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 330
		bodyModel[85].setRotationPoint(-10.25F, 0.5F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 331
		bodyModel[86].setRotationPoint(-13F, -5F, -8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 332
		bodyModel[87].setRotationPoint(-12.5F, 0F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[88].setRotationPoint(-12.75F, -18F, -5.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 334
		bodyModel[89].setRotationPoint(-11.25F, 0.5F, 5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 335
		bodyModel[90].setRotationPoint(-13F, -5F, 4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		bodyModel[91].setRotationPoint(-12.5F, 0F, 4.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[92].setRotationPoint(-8.75F, -18F, 4.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 338
		bodyModel[93].setRotationPoint(-7.25F, 0.5F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 339
		bodyModel[94].setRotationPoint(-8.5F, 0F, 4.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 340
		bodyModel[95].setRotationPoint(-9F, -5F, 4.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[96].setRotationPoint(-3.5F, 0F, 4.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 342
		bodyModel[97].setRotationPoint(-4F, -5F, 4.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 343
		bodyModel[98].setRotationPoint(-2.25F, 0.5F, 5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
		bodyModel[99].setRotationPoint(1.5F, 0F, 4.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 345
		bodyModel[100].setRotationPoint(2.75F, 0.5F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 346
		bodyModel[101].setRotationPoint(1F, -5F, 4.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[102].setRotationPoint(-3.75F, -18F, 4.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[103].setRotationPoint(1.25F, -18F, 4.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[104].setRotationPoint(-12.75F, -18F, 4.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[105].setRotationPoint(18.25F, -18F, 4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 333
		bodyModel[106].setRotationPoint(-13.5F, -3.5F, -10.1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 43, 9, 1, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 336
		bodyModel[107].setRotationPoint(-13.5F, -3F, 9.1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 361
		bodyModel[108].setRotationPoint(17.5F, -3.5F, -10.1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[109].setRotationPoint(17.5F, 6F, -10.1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 363
		bodyModel[110].setRotationPoint(17.5F, -15F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 12, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 367
		bodyModel[111].setRotationPoint(17.5F, 4F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 61
		bodyModel[112].setRotationPoint(28F, -15F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 88
		bodyModel[113].setRotationPoint(28F, -15F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[114].setRotationPoint(28F, -19F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[115].setRotationPoint(28F, -18F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 404
		bodyModel[116].setRotationPoint(28F, -18F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[117].setRotationPoint(28F, -19F, -9F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 406
		bodyModel[118].setRotationPoint(20.75F, 0.5F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[119].setRotationPoint(21.5F, -5F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 408
		bodyModel[120].setRotationPoint(23.5F, 0F, -8.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 409
		bodyModel[121].setRotationPoint(25.75F, 0.5F, -6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[122].setRotationPoint(26.5F, -5F, -8.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[123].setRotationPoint(22.25F, -18F, -5.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[124].setRotationPoint(27.25F, -18F, -5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 413
		bodyModel[125].setRotationPoint(18.5F, 0F, 4.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[126].setRotationPoint(18F, -5F, 4.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 415
		bodyModel[127].setRotationPoint(19.75F, 0.5F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 416
		bodyModel[128].setRotationPoint(23F, -5F, 4.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 417
		bodyModel[129].setRotationPoint(23.5F, 0F, 4.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 418
		bodyModel[130].setRotationPoint(24.75F, 0.5F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 419
		bodyModel[131].setRotationPoint(18.5F, 0F, -8.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[132].setRotationPoint(23.25F, -18F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, 0.2F, 0F, 1F, 1F, 0F, 1F, -2F, 0F, 1F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1.2F); // Box 131
		bodyModel[133].setRotationPoint(-26.5F, -15F, -6.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 9, 11, 0F,-0.7F, 0.5F, -0.3F, 0F, 0.5F, 1.7F, 0F, 0.5F, 0.7F, -0.7F, 0.5F, -1.3F, -0.7F, 0F, -0.3F, 0F, 0F, 1.7F, 0F, 0F, 0.7F, -0.7F, 0F, -1.3F); // Box 132
		bodyModel[134].setRotationPoint(-28.5F, -4F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 11, 11, 0F,-1.3F, 0F, -0.3F, 0F, 0F, 1.7F, 0F, 0F, 0.7F, -1.3F, 0F, -1.3F, -0.7F, 0.5F, -0.3F, 0F, 0.5F, 1.7F, 0F, 0.5F, 0.7F, -0.7F, 0.5F, -1.3F); // Box 133
		bodyModel[135].setRotationPoint(-28.5F, -16F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F); // Box 138
		bodyModel[136].setRotationPoint(-25.5F, -15.5F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 2, 19, 0F,0F, 0F, -1.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F); // Box 147
		bodyModel[137].setRotationPoint(-23.5F, -18F, -9.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 148
		bodyModel[138].setRotationPoint(-18.5F, -16F, -9.5F);

		bodyModel[139].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -1F, 0F, 1F, -0.625F, 0F, 1F, 0.125F, 0.5F, 1F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0.5F, 0F, 0.5F); // Box 149
		bodyModel[139].setRotationPoint(-18F, -14F, -9.5F);

		bodyModel[140].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.875F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 1F, 0.375F, 0.5F, 0F, -0.875F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.375F); // Box 150
		bodyModel[140].setRotationPoint(-15.5F, -14F, -9.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 158
		bodyModel[141].setRotationPoint(-23.5F, -16F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F); // Box 190
		bodyModel[142].setRotationPoint(-25.5F, 6F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[143].setRotationPoint(-27.4F, -0.600000000000001F, 5.35F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[144].setRotationPoint(-27.4F, -0.600000000000001F, -6.6F);

		bodyModel[145].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -1F, 0F, 1F, -0.875F, 0F, 1F, 0.375F, 0.5F, 1F, 0.625F, 0.5F, 0F, -1.125F, 0F, 0F, -0.875F, 0F, 0F, 0.375F, 0.5F, 0F, 0.75F); // Box 190
		bodyModel[145].setRotationPoint(-23F, -14F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.875F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 1F, 0.375F, 0.5F, 0F, -0.875F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.375F); // Box 191
		bodyModel[146].setRotationPoint(-20.5F, -14F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, -1.2F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 1F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.2F); // Box 192
		bodyModel[147].setRotationPoint(-26.5F, -15F, 4.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 193
		bodyModel[148].setRotationPoint(-23.5F, 6F, -10.1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 194
		bodyModel[149].setRotationPoint(-26.5F, 4F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F); // Box 195
		bodyModel[150].setRotationPoint(-26.5F, 4F, 6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 196
		bodyModel[151].setRotationPoint(-23.5F, -16F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1.3F); // Box 197
		bodyModel[152].setRotationPoint(-23.5F, -14.5F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0.5F, 1.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, -1.4F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.4F); // Box 198
		bodyModel[153].setRotationPoint(-23.5F, -3F, 9.1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0.7F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F); // Box 199
		bodyModel[154].setRotationPoint(-25.5F, -3F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0.7F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 200
		bodyModel[155].setRotationPoint(-25.5F, -3F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 201
		bodyModel[156].setRotationPoint(-25.5F, -15.5F, -8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1.1F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.8F); // Box 202
		bodyModel[157].setRotationPoint(-23.5F, 6F, 8.1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 1, 17, 0F,0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.75F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 203
		bodyModel[158].setRotationPoint(-23.5F, -19F, -8F);

		bodyModel[159].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 204
		bodyModel[159].setRotationPoint(7.5F, 4F, 7F);

		bodyModel[160].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 205
		bodyModel[160].setRotationPoint(7.5F, 4F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 206
		bodyModel[161].setRotationPoint(12F, -5F, 4.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 207
		bodyModel[162].setRotationPoint(13.75F, 0.5F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
		bodyModel[163].setRotationPoint(12.5F, 0F, 4.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 209
		bodyModel[164].setRotationPoint(8.75F, 0.5F, 5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[165].setRotationPoint(7.5F, 0F, 4.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 211
		bodyModel[166].setRotationPoint(7F, -5F, 4.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[167].setRotationPoint(7.25F, -18F, 4.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[168].setRotationPoint(12.25F, -18F, 4.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, -0.2F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, -0.75F, -0.2F, 0.5F, -0.75F, 1F, 0.5F, -0.75F, -1F, 1.5F, -0.75F, 0F); // Box 367
		bodyModel[169].setRotationPoint(-25F, 4F, -7.71F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F, 1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.5F); // Box 369
		bodyModel[170].setRotationPoint(-23.5F, 4F, 9.21F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 371
		bodyModel[171].setRotationPoint(-13.5F, 4F, 9.21F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 376
		bodyModel[172].setRotationPoint(-13.51F, 4F, -10.19F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 377
		bodyModel[173].setRotationPoint(17.49F, 4F, -10.19F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.2F, 1.5F, -0.75F, 0F, 0.5F, -0.75F, -1F, 0.5F, -0.75F, 1F, 0.5F, -0.75F, -0.2F); // Box 186
		bodyModel[174].setRotationPoint(-25F, 4F, 6.71F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 43, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[175].setRotationPoint(-13.5F, -20F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 43, 1, 5, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[176].setRotationPoint(-13.5F, -20F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 43, 1, 6, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[177].setRotationPoint(-13.5F, -20F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -1.5F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 380
		bodyModel[178].setRotationPoint(-23.5F, -20F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1.5F, 0F, -1F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F); // Box 381
		bodyModel[179].setRotationPoint(-23.5F, -20F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1.5F, -0.25F, 0F, -1F, 0F, -1F, -0.2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 382
		bodyModel[180].setRotationPoint(-23.5F, -20F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 618
		bodyModel[181].setRotationPoint(-13.5F, -16.1F, -10.16F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 0F, 0.25F, -0.3F, 0F, -1F, 0.5F, 0F, 1.6F, -0.35F, 0F, 0.75F, 0.4F, -0.75F, 0.25F, -0.3F, -0.75F, -1F, 0.5F, -0.75F, 1.6F, -0.35F, -0.75F, 0.75F); // Box 619
		bodyModel[182].setRotationPoint(-27F, -16.1F, 5.01F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 43, 1, 1, 0F,0F, 0F, 0F, 0.025F, 0F, 0F, 0.025F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.75F, 0F, 0.025F, -0.75F, 0F, 0.025F, -0.75F, -0.05F, 0F, -0.75F, -0.05F); // Box 620
		bodyModel[183].setRotationPoint(-13.51F, -16.1F, 9.21F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.8F, 0F, -0.75F, 1.5F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -1.8F); // Box 415
		bodyModel[184].setRotationPoint(-23.5F, -16.1F, 9.41F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0.75F, -0.6F, 0F, 1.15F, -0.6F, 0F, 1.15F, 0F, 0F, 0.75F, 0F, -0.75F, 0.75F, -0.6F, -0.75F, 1.15F, -0.6F, -0.75F, 1.15F, 0F, -0.75F, 0.75F); // Box 417
		bodyModel[185].setRotationPoint(-27.4F, -16.1F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0.8F, 0.5F, 0F, 1.6F, -0.3F, 0F, -1F, 0.4F, 0F, 0.25F, -0.35F, -0.75F, 0.8F, 0.5F, -0.75F, 1.6F, -0.3F, -0.75F, -1F, 0.4F, -0.75F, 0.25F); // Box 218
		bodyModel[186].setRotationPoint(-27F, -16.1F, -5.99F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0.3F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, -0.75F, 1.5F, 0F, -0.75F, 0.3F, 0F, -0.75F, -0.8F, 0F, -0.75F, -1.8F); // Box 219
		bodyModel[187].setRotationPoint(-25.5F, -16.1F, 8.41F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1.8F, 0F, 0F, -0.8F, 0F, 0F, 0.3F, 0F, 0F, 1.5F, 0F, -0.75F, -1.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0.3F, 0F, -0.75F, 1.5F); // Box 220
		bodyModel[188].setRotationPoint(-25.5F, -16.1F, -9.41F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -1.8F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.75F, -1.8F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 1.5F); // Box 221
		bodyModel[189].setRotationPoint(-23.5F, -16.1F, -10.41F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.6F, -0.75F, -0.5F, -0.4F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[190].setRotationPoint(-27.3F, -1F, 5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.4F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.2F, 0F, 0F, -0.5F); // Box 31
		bodyModel[191].setRotationPoint(-27.3F, -1F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -0.4F, 0F, -0.6F, -0.6F); // Box 32
		bodyModel[192].setRotationPoint(-27.3F, 1F, 6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, -0.75F, -0.5F, -0.4F, 0F, -0.3F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[193].setRotationPoint(-27.3F, 1F, 5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, -0.2F, 0F, 0F, -0.5F); // Box 331
		bodyModel[194].setRotationPoint(-27.3F, 0F, 6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[195].setRotationPoint(-27.3F, 0F, 5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.75F, -0.5F, -0.4F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.2F, 0F, 0F, -0.3F); // Box 336
		bodyModel[196].setRotationPoint(-27.3F, -1F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.2F, 0F, 0F, -0.3F); // Box 337
		bodyModel[197].setRotationPoint(-27.3F, 0F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.5F, -0.5F, -0.4F, 0F, -0.6F, -0.6F); // Box 338
		bodyModel[198].setRotationPoint(-27.3F, 1F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.6F, 0F, -0.5F, -0.4F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[199].setRotationPoint(-27.3F, -1F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.35F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[200].setRotationPoint(-27.3F, 0F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.35F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.4F, 0F, -0.3F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[201].setRotationPoint(-27.3F, 1F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 393
		bodyModel[202].setRotationPoint(-2.65F, 8.75F, -6.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[203].setRotationPoint(-9.5F, 7.5F, -6.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
		bodyModel[204].setRotationPoint(-13.5F, 8.75F, -6.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[205].setRotationPoint(-9.5F, 7.5F, 5.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 420
		bodyModel[206].setRotationPoint(-2.65F, 8.75F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
		bodyModel[207].setRotationPoint(-13.5F, 8.75F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 90, 7, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -50F, -3F, 0F, -50F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 239
		bodyModel[208].setRotationPoint(-12F, -22.5F, -8.8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 90, 7, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -50F, -3F, 0F, -50F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 325
		bodyModel[209].setRotationPoint(-12F, -22.5F, 8.7F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 24
		bodyModel[210].setRotationPoint(3F, 8.5F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 457
		bodyModel[211].setRotationPoint(-15F, 8.5F, -8F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 458
		bodyModel[212].setRotationPoint(-16F, 8.5F, -7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[213].setRotationPoint(-15F, 8.5F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[214].setRotationPoint(-12.5F, 7.5F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[215].setRotationPoint(-3.5F, 7.5F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[216].setRotationPoint(-2.5F, 5.5F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 426
		bodyModel[217].setRotationPoint(-10.5F, 5.5F, -8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[218].setRotationPoint(-3.5F, 7.5F, 6.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[219].setRotationPoint(-12.5F, 7.5F, 6.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 437
		bodyModel[220].setRotationPoint(-10.5F, 5.5F, 6.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[221].setRotationPoint(-2.5F, 5.5F, 6.5F);
	}
}