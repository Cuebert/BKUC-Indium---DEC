.class public Ll7/g;
.super Ll9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/g$c;,
        Ll7/g$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Overlay"

    .line 1
    invoke-direct {p0, v0}, Ll9/b;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ll7/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll7/g$b;-><init>(Ll7/g;Ll7/g$a;)V

    const-string v2, "close"

    invoke-virtual {p0, v2, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    .line 3
    new-instance v0, Ll7/g$c;

    invoke-direct {v0, p0, v1}, Ll7/g$c;-><init>(Ll7/g;Ll7/g$a;)V

    const-string v1, "setSubmitState"

    invoke-virtual {p0, v1, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    return-void
.end method
