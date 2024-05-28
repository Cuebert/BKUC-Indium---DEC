.class Lja/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja/e;->m(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lja/e;


# direct methods
.method constructor <init>(Lja/e;)V
    .locals 0

    iput-object p1, p0, Lja/e$b;->a:Lja/e;

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

    const-string v2, "getPhoneNumber_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma/a;->b(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lja/e$b;->a:Lja/e;

    const-string v0, "getPhoneNumber"

    invoke-static {p1, v0}, Lja/e;->f(Lja/e;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess()V
    .locals 0

    return-void
.end method
