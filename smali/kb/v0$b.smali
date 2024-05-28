.class public final Lkb/v0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lva/e$b<",
        "Lkb/v0;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic n:Lkb/v0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/v0$b;

    invoke-direct {v0}, Lkb/v0$b;-><init>()V

    sput-object v0, Lkb/v0$b;->n:Lkb/v0$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
