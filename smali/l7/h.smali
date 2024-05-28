.class public Ll7/h;
.super Ll9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/h$a;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String; = "l7.h"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "Push"

    .line 1
    invoke-direct {p0, v0}, Ll9/b;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ll7/h$a;

    invoke-direct {v0, p0, p1}, Ll7/h$a;-><init>(Ll7/h;Landroid/content/Context;)V

    const-string p1, "pushPermissionTrigger"

    invoke-virtual {p0, p1, v0}, Ll9/b;->d(Ljava/lang/String;Ll9/b$b;)V

    return-void
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    sget-object v0, Ll7/h;->c:Ljava/lang/String;

    return-object v0
.end method
