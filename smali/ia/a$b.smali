.class Lia/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lia/a;->h(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lia/a;


# direct methods
.method constructor <init>(Lia/a;)V
    .locals 0

    iput-object p1, p0, Lia/a$b;->a:Lia/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lia/a$b;->a:Lia/a;

    const-string v1, "intensity"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lia/a;->b(Lia/a;F)F
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    iget-object p1, p0, Lia/a$b;->a:Lia/a;

    invoke-virtual {p1}, Lia/a;->j()V

    return-void

    :catch_0
    const-string p1, "HapticProtocol"

    const-string v0, "Failed to parse JSON in UpdateSingletonVibration request"

    .line 3
    invoke-static {p1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
