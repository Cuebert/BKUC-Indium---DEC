.class public Lcom/Indium/JniUtils;
.super Ljava/lang/Object;
.source "JniUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/Indium/JniUtils$ClipRunner;,
        Lcom/Indium/JniUtils$ClipGetter;
    }
.end annotation


# static fields
.field public static FILESYS_AUTOEXEC:Ljava/lang/String; = "autoexec"

.field public static FILESYS_DATA:Ljava/lang/String; = "app_assets/content/Indium"

.field public static FILESYS_SCRIPTS:Ljava/lang/String; = "scripts"

.field public static FILESYS_WORKSPACE:Ljava/lang/String; = "workspace"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static append_file(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 371
    invoke-static {p0, p1}, Lcom/Indium/JniUtils;->read_file(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 372
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lcom/Indium/JniUtils;->write_file(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ask_permissions()V
    .locals 5

    .line 127
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v2, "android.permission.READ_MEDIA_IMAGES"

    const-string v3, "android.permission.MANAGE_EXTERNAL_STORAGE"

    const-string v4, "android.permission.ACCESS_MEDIA_LOCATION"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/Indium/JniUtils$$ExternalSyntheticApiModelOutline0;->m(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method

.method public static delete_path(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 226
    :cond_0
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 232
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 235
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 236
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 238
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 240
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 243
    array-length p1, p0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_3

    aget-object v2, p0, v1

    .line 245
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 247
    invoke-static {v2}, Lcom/Indium/JniUtils;->dir_delete_help(Ljava/io/File;)V

    goto :goto_2

    .line 251
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 257
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method private static dir_delete_help(Ljava/io/File;)V
    .locals 5

    .line 199
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 204
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 206
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 208
    invoke-static {v3}, Lcom/Indium/JniUtils;->dir_delete_help(Ljava/io/File;)V

    goto :goto_1

    .line 212
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 217
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    :cond_2
    return-void
.end method

.method public static dump_logs()V
    .locals 0

    .line 122
    invoke-static {}, Lcom/Indium/Logcat;->dump_logs()V

    return-void
.end method

.method public static enable_debug_mode()V
    .locals 1

    const/4 v0, 0x1

    .line 117
    sput-boolean v0, Lcom/Indium/IndiumMain;->debug_mode:Z

    return-void
.end method

.method public static get_Indium_dir()Ljava/io/File;
    .locals 3

    .line 191
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_storage_path()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Indium"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    return-object v0
.end method

.method public static get_clipboard_data()Ljava/lang/String;
    .locals 4

    .line 93
    const-string v0, ""

    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/Indium/JniUtils$ClipGetter;

    invoke-direct {v2}, Lcom/Indium/JniUtils$ClipGetter;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 95
    sget-object v2, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 98
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 105
    sget-object v2, Lcom/Indium/Logcat;->log_tag:Ljava/lang/String;

    const-string v3, "Exception thrown during get clipboard data ( Ex Interrupted )"

    invoke-virtual {v1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0

    :catch_1
    move-exception v1

    .line 101
    sget-object v2, Lcom/Indium/Logcat;->log_tag:Ljava/lang/String;

    const-string v3, "Exception thrown during get clipboard data"

    invoke-virtual {v1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method public static get_data_dir()Ljava/lang/String;
    .locals 1

    .line 184
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    return-object v0
.end method

.method public static get_display_density()F
    .locals 3

    .line 142
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 143
    sget-object v1, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 144
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0
.end method

.method public static get_hwid()Ljava/lang/String;
    .locals 2

    .line 112
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static get_storage_path()Ljava/lang/String;
    .locals 2

    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 162
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    .line 167
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    .line 172
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 176
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 179
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static is_dir(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 308
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 310
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 314
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 317
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 319
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p0

    return p0
.end method

.method public static is_file(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 291
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 297
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 300
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 302
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result p0

    return p0
.end method

.method public static list_files(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 6

    .line 263
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 269
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 272
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 273
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 275
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object p0

    .line 278
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 279
    array-length v1, p0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    .line 281
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 284
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    .line 285
    invoke-interface {v0, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static make_folder(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 342
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 348
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 351
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 356
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x0

    .line 359
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 366
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_1
    return-void
.end method

.method public static path_exists(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 325
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 331
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 334
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 336
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method public static permissions_granted()Z
    .locals 3

    .line 132
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 137
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    invoke-static {}, Lcom/Indium/JniUtils$$ExternalSyntheticApiModelOutline0;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static read_file(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 406
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 412
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 415
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 417
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 419
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 423
    :try_start_0
    new-instance p1, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/FileReader;

    invoke-direct {v1, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    const/4 v0, 0x0

    .line 427
    :goto_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    .line 432
    const-string v0, "\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    goto :goto_1

    .line 440
    :cond_2
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 444
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 447
    :goto_2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static set_clipboard_data(Ljava/lang/String;)V
    .locals 2

    .line 83
    :try_start_0
    sget-object v0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    new-instance v1, Lcom/Indium/JniUtils$ClipRunner;

    invoke-direct {v1, p0}, Lcom/Indium/JniUtils$ClipRunner;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 88
    :goto_0
    sget-object p0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    const-string v0, "Indium: Copied data to clipboard!"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    return-void
.end method

.method public static write_file(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 378
    sget-object v0, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    new-instance p0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_data_dir()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/Indium/JniUtils;->FILESYS_DATA:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 384
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/Indium/JniUtils;->get_Indium_dir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p0, v0

    .line 387
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 389
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 393
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 394
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 395
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 399
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    return-void
.end method
