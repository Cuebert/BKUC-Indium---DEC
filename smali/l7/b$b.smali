.class Ll7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ll7/b;


# direct methods
.method private constructor <init>(Ll7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/b$b;->a:Ll7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/b;Ll7/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/b$b;-><init>(Ll7/b;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "placeID"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ShareGameToChat.execute() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rbx.hybrid"

    invoke-static {v2, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0, v1}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    :goto_0
    return-void
.end method
