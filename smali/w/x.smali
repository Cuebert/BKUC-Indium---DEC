.class public Lw/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/x$a;
    }
.end annotation


# static fields
.field private static final a:Lw/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/x$a;

    invoke-direct {v0}, Lw/x$a;-><init>()V

    sput-object v0, Lw/x;->a:Lw/t;

    return-void
.end method

.method public static a()Lw/t;
    .locals 1

    sget-object v0, Lw/x;->a:Lw/t;

    return-object v0
.end method
