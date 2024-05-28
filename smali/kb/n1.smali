.class public final Lkb/n1;
.super Lva/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/n1$a;
    }
.end annotation


# static fields
.field public static final p:Lkb/n1$a;


# instance fields
.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/n1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/n1$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lkb/n1;->p:Lkb/n1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lkb/n1;->p:Lkb/n1$a;

    invoke-direct {p0, v0}, Lva/a;-><init>(Lva/e$b;)V

    return-void
.end method
