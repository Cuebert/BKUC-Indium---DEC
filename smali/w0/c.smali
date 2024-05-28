.class public final Lw0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw0/c$a;
    }
.end annotation


# static fields
.field public static final a:Lw0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw0/c$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lw0/c;->a:Lw0/c$a;

    return-void
.end method
