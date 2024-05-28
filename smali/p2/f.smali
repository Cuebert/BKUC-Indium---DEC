.class public final Lp2/f;
.super Lo2/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp2/f$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final r:Lp2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/f$a;

    invoke-direct {v0}, Lp2/f$a;-><init>()V

    invoke-virtual {v0}, Lp2/f$a;->b()Lp2/f;

    move-result-object v0

    sput-object v0, Lp2/f;->r:Lp2/f;

    return-void
.end method

.method synthetic constructor <init>(Lp2/f$a;Lp2/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lo2/a$a;-><init>(Lo2/a$a$a;)V

    return-void
.end method
