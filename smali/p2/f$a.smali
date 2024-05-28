.class public final Lp2/f$a;
.super Lo2/a$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo2/a$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lp2/f;
    .locals 2

    new-instance v0, Lp2/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp2/f;-><init>(Lp2/f$a;Lp2/g;)V

    return-object v0
.end method

.method public c()Lp2/f$a;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lo2/a$a$a;->a:Ljava/lang/Boolean;

    return-object p0
.end method
