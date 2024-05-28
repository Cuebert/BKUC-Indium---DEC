.class Ll7/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Ll7/g;


# direct methods
.method private constructor <init>(Ll7/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/g$c;->a:Ll7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/g;Ll7/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/g$c;-><init>(Ll7/g;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleOverlay SetSubmitState.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RBHybridModuleOverlay"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object p1

    .line 3
    :try_start_0
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    new-instance v1, La7/j;

    const-string v2, "submitButtonState"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, La7/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lbc/c;->j(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    return-void
.end method
