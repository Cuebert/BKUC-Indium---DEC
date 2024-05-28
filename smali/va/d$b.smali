.class public final Lva/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lva/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lva/e$b<",
        "Lva/d;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic n:Lva/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lva/d$b;

    invoke-direct {v0}, Lva/d$b;-><init>()V

    sput-object v0, Lva/d$b;->n:Lva/d$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
