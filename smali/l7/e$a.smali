.class Ll7/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Ll7/e;


# direct methods
.method constructor <init>(Ll7/e;)V
    .locals 0

    iput-object p1, p0, Ll7/e$a;->a:Ll7/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 1

    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll7/e$a;->b(Ll9/a;Lbc/c;)V

    return-void
.end method

.method b(Ll9/a;Lbc/c;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleLocalization LanguageChangeTrigger.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "newRobloxLanguageValue"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "newRobloxLocaleValue "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {v0}, Ls7/f;->b(Ljava/lang/String;)Ls7/f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    new-instance v1, La7/a;

    invoke-direct {v1, v0}, La7/a;-><init>(Ls7/f;)V

    invoke-virtual {p2, v1}, Lbc/c;->j(Ljava/lang/Object;)V

    :cond_0
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2, v3}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2, v3}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    :goto_0
    return-void
.end method
