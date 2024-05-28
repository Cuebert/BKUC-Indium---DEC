.class public Ll7/i;
.super Ll9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/i$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "RealTime"

    .line 1
    invoke-direct {p0, v0}, Ll9/b;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ll7/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll7/i$b;-><init>(Ll7/i;Ll7/i$a;)V

    const-string v1, "isConnected"

    invoke-virtual {p0, v1, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    return-void
.end method
