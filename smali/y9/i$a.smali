.class Ly9/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/i;->F(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly9/i;


# direct methods
.method constructor <init>(Ly9/i;)V
    .locals 0

    iput-object p1, p0, Ly9/i$a;->a:Ly9/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "supportsGetSMSOTP_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma/a;->b(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Ly9/i$a;->a:Ly9/i;

    const-string v0, "supportsGetSMSOTP"

    const-string v1, "support"

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Ly9/i;->i(Ly9/i;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public onSuccess()V
    .locals 4

    iget-object v0, p0, Ly9/i$a;->a:Ly9/i;

    const-string v1, "supportsGetSMSOTP"

    const-string v2, "support"

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Ly9/i;->i(Ly9/i;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
