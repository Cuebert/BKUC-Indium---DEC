.class public final Lw0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw0/b$a;
    }
.end annotation


# static fields
.field public static final a:Lw0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw0/b$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lw0/b;->a:Lw0/b$a;

    return-void
.end method
