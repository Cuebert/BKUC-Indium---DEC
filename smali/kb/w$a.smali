.class public final Lkb/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lva/e$b<",
        "Lkb/w;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic n:Lkb/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/w$a;

    invoke-direct {v0}, Lkb/w$a;-><init>()V

    sput-object v0, Lkb/w$a;->n:Lkb/w$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
