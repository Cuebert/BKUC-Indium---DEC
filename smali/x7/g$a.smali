.class Lx7/g$a;
.super Lh7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/g;->n(Lx7/g$d;Lh7/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/g$d;

.field final synthetic b:Lx7/g;


# direct methods
.method constructor <init>(Lx7/g;Lx7/g$d;)V
    .locals 0

    iput-object p1, p0, Lx7/g$a;->b:Lx7/g;

    iput-object p2, p0, Lx7/g$a;->a:Lx7/g$d;

    invoke-direct {p0}, Lh7/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lh7/j;)V
    .locals 4

    .line 1
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lb9/c;->f()I

    move-result v1

    .line 3
    invoke-virtual {p1}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 4
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lh7/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "robux"

    .line 5
    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    .line 6
    invoke-virtual {v0, v1}, Lb9/c;->r(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 8
    :cond_0
    :goto_0
    iget-object p1, p0, Lx7/g$a;->a:Lx7/g$d;

    if-eqz p1, :cond_1

    .line 9
    invoke-interface {p1, v3, v1}, Lx7/g$d;->a(ZI)V

    :cond_1
    return-void
.end method
