.class Lf9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf9/g;
    .locals 2

    const-string v0, "rbx.xapkmanager"

    const-string v1, "default XAPKManager created"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lf9/g;

    invoke-direct {v0}, Lf9/g;-><init>()V

    return-object v0
.end method
