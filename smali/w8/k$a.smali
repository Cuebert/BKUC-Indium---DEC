.class Lw8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/game/b$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/k;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/k;


# direct methods
.method constructor <init>(Lw8/k;)V
    .locals 0

    iput-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    const-string v1, "load_setting_end"

    invoke-virtual {v0, v1}, Lma/a;->b(Ljava/lang/String;)V

    .line 2
    invoke-static {}, Ln6/b;->c()Ln6/b;

    move-result-object v0

    iget-object v1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {v1}, Lw8/k;->c(Lw8/k;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln6/b;->d(Landroid/content/Context;)V

    if-nez p1, :cond_3

    const-string p1, "InitHelper"

    const-string v0, "getAllAppSettings: ... Settings loaded."

    .line 3
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    sget-object v0, Lw8/k$f;->p:Lw8/k$f;

    invoke-static {p1, v0}, Lw8/k;->g(Lw8/k;Lw8/k$f;)Lw8/k$f;

    .line 5
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {p1}, Lw8/k;->h(Lw8/k;)V

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->l0()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    invoke-static {}, Laa/f;->h()Laa/f;

    move-result-object p1

    invoke-virtual {p1}, Laa/f;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    invoke-static {}, Laa/f;->h()Laa/f;

    move-result-object p1

    iget-object v0, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {v0}, Lw8/k;->c(Lw8/k;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Laa/f;->g(Landroid/content/Context;)V

    .line 9
    :cond_0
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object p1

    invoke-virtual {p1}, Lla/c;->o()V

    .line 10
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-virtual {p1}, Lw8/k;->z()V

    const-string p1, "SaveMicroProfileScreenshotsInExternalStorage"

    .line 11
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object p1

    const-string v0, "mounted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {p1}, Lw8/k;->c(Lw8/k;)Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    .line 15
    :cond_1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->Y0()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 16
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {p1}, Lw8/k;->c(Lw8/k;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lc9/p;->e(Landroid/content/Context;)Lc9/p;

    move-result-object p1

    invoke-virtual {p1}, Lc9/p;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {p1}, Lw8/k;->i(Lw8/k;)V

    goto :goto_0

    .line 18
    :cond_3
    iget-object p1, p0, Lw8/k$a;->a:Lw8/k;

    invoke-static {p1}, Lw8/k;->j(Lw8/k;)V

    :goto_0
    return-void
.end method
